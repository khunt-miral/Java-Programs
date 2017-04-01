package Queue;

public class QueueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       QueueLL q=new QueueLL();
       q.enqueue(10);
       q.enqueue(20);
       q.enqueue(0);
       q.enqueue(50);
       q.display();
       q.dequeue();
       q.display();
       System.out.println(q.dequeue());
       q.display();
       q.enqueue(35);
       q.enqueue(10);
       q.enqueue(100);
       q.enqueue(-10);
       q.display();
       System.out.println(q.size());
       System.out.println(q.isEmpty());
	}

}
