package Queue;

public class QClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray q=new QueueArray();
		q.enqueue(10);
		q.enqueue(40);
		q.enqueue(20);
		q.enqueue(90);
		System.out.println(q.size());
		q.dequeue();
		System.out.println(q.size());
	}

}
