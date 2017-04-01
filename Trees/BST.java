package Trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class BST {
	private class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	private Node root;

	public BST() {
		this.root = null;
	}

	public void add(int data) {
		Node newNode = new Node(data);
		if (this.root == null) {
			this.root = newNode;
		} else {
			Node p = this.root;
			Node q = null;
			while (p != null) {
				if (p.data > data) {
					q = p;
					p = p.left;
				} else {
					q = p;
					p = p.right;
				}
			}
			if (data > q.data) {
				q.right = newNode;
			} else {
				q.left = newNode;
			}
		}
	}

	public int remove() {
		return 0;
	}

	public void display() {
		this.displayRec(this.root);

	}

	private void displayRec(Node node) {
		if (node == null)
			return;
		if (node.left != null) {
			System.out.print(node.left.data + " => ");
		} else {
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if (node.right != null) {
			System.out.print(" <= " + node.right.data);
		} else {
			System.out.print(" <= END");
		}
		System.out.println();
		this.displayRec(node.left);
		this.displayRec(node.right);
	}

	public int size() {
		return this.sizeRec(this.root);
	}

	private int sizeRec(Node node) {
		if (node.left == null && node.right == null)
			return 1;
		int lc = 0, rc = 0;
		if (node.left != null) {
			lc = this.sizeRec(node.left);
		}
		if (node.right != null) {
			rc = this.sizeRec(node.right);
		}
		return lc + rc + 1;
	}

	public boolean find(int data) {
		return this.findRec(data, this.root);
	}

	private boolean findRec(int data, Node node) {
		if (node == null)
			return false;
		if (node.data == data)
			return true;
		boolean bn1 = false, bn2 = false;
		if (node.data > data) {
			bn1 = this.findRec(data, node.left);
		} else {
			bn2 = this.findRec(data, node.right);
		}
		return bn1 || bn2;
	}

	public int height() {
		return this.heightRec(this.root);
	}

	private int heightRec(Node node) {
		if (node.left == null && node.right == null) {
			return 0;
		}
		int lh = 0, rh = 0;
		if (node.left != null) {
			lh = this.heightRec(node.left);
		}
		if (node.right != null) {
			rh = this.heightRec(node.right);
		}
		return 1 + Math.max(lh, rh);
	}

	public int sum() {
		return this.sumRec(this.root);
	}

	private int sumRec(Node node) {
		if (node.left == null && node.right == null)
			return node.data;
		int sl = 0, sr = 0;
		if (node.left != null) {
			sl = this.sumRec(node.left);
		}
		if (node.right != null) {
			sr = this.sumRec(node.right);
		}
		return sl + sr + node.data;
	}

	public int nextLarger(int data) {
		nl obj = new nl();
		this.nextLargerRec(obj, this.root, data);
		return obj.value;
	}

	private class nl {
		int value;

		public nl() {
			this.value = Integer.MAX_VALUE;
		}
	}

	private void nextLargerRec(nl obj, Node node, int data) {
		if (node.data > data && node.data < obj.value) {
			obj.value = node.data;
		}

		if (node.left != null) {
			this.nextLargerRec(obj, node.left, data);
		}
		if (node.right != null) {
			this.nextLargerRec(obj, node.right, data);
		}

	}

	public int prevSmaller(int data) {
		ps obj = new ps();
		this.prevSmallerRec(obj, this.root, data);
		return obj.value;

	}

	private class ps {
		int value;

		public ps() {
			this.value = Integer.MIN_VALUE;
		}
	}

	private void prevSmallerRec(ps obj, Node node, int data) {
		if (node.data < data && node.data > obj.value) {
			obj.value = node.data;
		}

		if (node.left != null) {
			this.prevSmallerRec(obj, node.left, data);
		}
		if (node.right != null) {
			this.prevSmallerRec(obj, node.right, data);
		}
	}

	public int min() {
		return this.minRec(this.root);

	}

	private int minRec(Node node) {
		if (node.left == null)
			return node.data;
		int min = 0;
		if (node.left != null)
			min = this.minRec(node.left);
		return min;
	}

	public boolean isBalanced() {
		bal obj = this.isBalancedRec(this.root);
		return obj.isBal;

	}

	private class bal {
		int height;
		boolean isBal;
	}

	private bal isBalancedRec(Node node) {
		if (node == null) {
			bal basePair = new bal();
			basePair.height = -1;
			basePair.isBal = true;
			return basePair;
		}
		bal left = null, right = null;
		left = this.isBalancedRec(node.left);
		right = this.isBalancedRec(node.right);
		bal myPair = new bal();
		if (!left.isBal || !right.isBal) {
			myPair.height = 1 + Math.max(left.height, right.height);
			myPair.isBal = false;
		} else {
			if (Math.abs(left.height - right.height) > 1) {
				myPair.height = 1 + Math.max(left.height, right.height);
				myPair.isBal = false;
			} else {
				myPair.height = 1 + Math.max(left.height, right.height);
				myPair.isBal = true;
			}
		}
		return myPair;
	}

	private class md {
		int diff;

		public md() {
			this.diff = Integer.MAX_VALUE;
		}
	}

	public int mindiff() {
		md obj = new md();
		this.mindiffRec(this.root, obj);
		return obj.diff;

	}

	private void mindiffRec(Node node, md obj) {

		if (node.left != null) {
			if (Math.abs(node.data - node.left.data) < obj.diff) {
				obj.diff = Math.abs(node.data - node.left.data);
			}
			this.mindiffRec(node.left, obj);
		}

		if (node.right != null) {
			if (Math.abs(node.data - node.right.data) < obj.diff) {
				obj.diff = Math.abs(node.data - node.right.data);
			}
			this.mindiffRec(node.right, obj);
		}
	}

	public ArrayList<Integer> inRange(int small, int large) {
		ArrayList<Integer> arr = new ArrayList<>();
		this.inRangeRec(this.root, arr, small, large);
		return arr;
	}

	private void inRangeRec(Node node, ArrayList<Integer> arr, int small, int large) {

		if (node.data < small) {

			if (node.right != null) {
				this.inRangeRec(node.right, arr, small, large);
			}
		} else if (node.data > large) {
			if (node.left != null) {
				this.inRangeRec(node.left, arr, small, large);
			}
		} else {
			arr.add(node.data);
			if (node.left != null) {
				this.inRangeRec(node.left, arr, small, large);
			}
			if (node.right != null) {
				this.inRangeRec(node.right, arr, small, large);
			}
		}
	}

	public void replaceWithHeight() {
		this.replaceWithHeightRec(this.root);

	}

	private class rwh {
		int height;
	}

	private rwh replaceWithHeightRec(Node node) {
		if (node.left == null && node.right == null) {
			rwh bp = new rwh();
			bp.height = 0;
			node.data = 0;
			return bp;
		}
		rwh left = null, right = null;
		if (node.left != null) {
			left = this.replaceWithHeightRec(node.left);
		}
		if (node.right != null) {
			right = this.replaceWithHeightRec(node.right);
		}
		rwh mp = new rwh();
		if (node.left != null && node.right != null) {
			mp.height = 1 + Math.max(right.height, left.height);
		} else if (node.left == null) {
			mp.height = 1 + right.height;
		} else {
			mp.height = 1 + left.height;
		}
		node.data = mp.height;
		return mp;
	}

	public void replaceWithSum() {
		this.replaceWithSumRec(this.root);
	}

	private void replaceWithSumRec(Node node) {
		if (node.left == null && node.right == null) {
			return;
		}
		if (node.left != null) {
			this.replaceWithSumRec(node.left);
		}
		if (node.right != null) {
			this.replaceWithSumRec(node.right);
		}

		if (node.left != null) {
			node.data += node.left.data;
		}
		if (node.right != null) {
			node.data += node.right.data;
		}

	}

	public int lca(int data1, int data2) {
		return this.lca(this.root, data1, data2);
	}

	private int lca(Node node, int data1, int data2) {
		if (node.data >= data1 && node.data <= data2) {
			return node.data;
		}
		if (node.data > data1 && node.data > data2) {
			return this.lca(node.left, data1, data2);
		} else if (node.data < data1 && node.data < data2) {
			return this.lca(node.right, data1, data2);
		} else
			return 0;

	}

	public ArrayList<String> sumPair(int target) {
		ArrayList<String> arr = new ArrayList<>();
		sp obj=new sp();
		this.sumPairRec(this.root, target, arr,obj);
		return arr;
	}

	private class sp {
		HashMap<Integer, Integer> pair;

		public sp() {
			this.pair = new HashMap<>();
		}
	}

	private void sumPairRec(Node node, int target, ArrayList<String> arr, sp obj) {
		if (!obj.pair.containsKey(target - node.data)) {
			if (this.find(target - node.data)) {
				arr.add("{" + node.data + ", " + (target - node.data) + "}");
			}
			obj.pair.put(node.data, target-node.data);
		}
		if (node.left != null) {
			this.sumPairRec(node.left, target, arr,obj);
		}
		if (node.right != null) {
			this.sumPairRec(node.right, target, arr,obj);
		}

	}
	//TODO
	public void commonNodes(BST bst){
		ArrayList<Integer>arr1=new ArrayList<>();
		ArrayList<Integer>arr2=new ArrayList<>();
		ArrayList<Integer>ans=new ArrayList<>();
		this.inorderArr(this.root, arr1);
		this.inorderArr(bst.root, arr2);
	}
	private void inorderArr(Node node,ArrayList<Integer>arr){
		if(node==null)
			return;
		this.inorderArr(node.left,arr);
		arr.add(node.data);
		this.inorderArr(node.right,arr);
	}
	
	
	
	public void inorder(){
		this.inorderRec(this.root);
		System.out.println();
	}
	private void inorderRec(Node node){
		if(node==null)
			return;
		this.inorderRec(node.left);
		System.out.print(node.data+", ");
		this.inorderRec(node.right);
	}
	
	
	public void preorder(){
		this.preorderRec(this.root);
		System.out.println();
	}
	private void preorderRec(Node node){
		if(node==null)
			return;
		System.out.print(node.data+", ");
		this.preorderRec(node.left);
		
		this.preorderRec(node.right);
	}
	
	
	public void postorder(){
		this.postorderRec(this.root);
		System.out.println();
	}
	private void postorderRec(Node node){
		if(node==null)
			return;
		
		this.postorderRec(node.left);
		this.postorderRec(node.right);
		System.out.print(node.data+", ");
	}
	
	private class store{
		int value;
		int kth;
		public store(){
			this.value=Integer.MAX_VALUE;
		}
	}
    public int kthSmallest(int k){
    	store obj=new store();
    	obj.kth=k;
    	this.kthSmallestRec(this.root,obj);
    	return obj.value;
    }
    private void kthSmallestRec(Node node,store obj){
    	if(node==null)
    		return;
    	this.kthSmallestRec(node.left,obj);
    	obj.kth--;
    	if(obj.kth==0 && obj.value==Integer.MAX_VALUE){
    		obj.value=node.data;
    	}
    	this.kthSmallestRec(node.right,obj);
    	
    }
}
