package Trees;

public class BinaryTree {
	private class Node{
		int data;
		Node left;
		Node right;
		public Node(int data,Node left,Node right){
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
	private Node root;
	private int size;
	public BinaryTree(){
		
	}

}
