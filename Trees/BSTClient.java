package Trees;

public class BSTClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();
		bst.add(10);
		bst.add(20);
		bst.add(-10);
		bst.add(-20);
//		System.out.println(bst.sum());
//		System.out.println(bst.size());
		bst.add(0);
		bst.add(23);
//		System.out.println(bst.sum());
		bst.add(15);
		bst.add(65);
		bst.add(40);
		bst.add(22);
		bst.add(12);
		bst.add(-50);
		bst.add(8);
		bst.add(7);
		bst.display();
//		System.out.println(bst.size());
//		System.out.println(bst.find(150));
//		System.out.println(bst.sum());
//		System.out.println(bst.nextLarger(-2));
//		System.out.println(bst.prevSmaller(-20));
		System.out.println(bst.min());
		System.out.println(bst.mindiff());
		System.out.println(bst.isBalanced());
		System.out.println(bst.inRange(-13, 67));
		//bst.replaceWithHeight();
		//bst.display();
		//System.out.println(bst.height());
	//	bst.replaceWithSum();
		//bst.display();
		System.out.println(bst.lca(-50,-10));
		System.out.println(bst.sumPair(15));
		bst.inorder();
		bst.postorder();
		bst.preorder();
		System.out.println(bst.kthSmallest(6));

	}

}
