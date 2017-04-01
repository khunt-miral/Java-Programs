package LinkedList;

public class LLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL ll = new LL();
		ll.addFirst(10);

		ll.addFirst(-10);
		ll.addLast(200);
		ll.addFirst(0);

		ll.addLast(100);
		ll.addBtw(32, 1);
		ll.dislay();
		System.out.println(ll.removeBtw(3));
		ll.dislay();
		System.out.println(ll.removeBtw(5));
		ll.dislay();
	}

}
