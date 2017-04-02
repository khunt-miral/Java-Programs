package Queue;

public class QueueLL {
	private class Node{
	 int data;
	 Node next;
	 public Node(int data){
		 this.next=null;
		 this.data=data;
		 
	 }
	 
	}
    
	Node front;
	Node rear;
    int size;
	public QueueLL(){
		this.size=0;
		this.rear=null;
		this.front=null;
	}

// Function for adding to the rear of queue
	public void enqueue(int data){
		Node newNode =new Node(data);
		if(this.rear==null)	{
			this.front=newNode;
			this.rear=newNode;
		}
		else{
			this.rear.next=newNode;
			rear=newNode;
		}
		this.size++;
	}
// Function for removing from the front of queue
	public Integer dequeue(){
	   if(this.front==null)
	   {
		   return null;
	   }
	   else{
		   Integer rv= this.front.data;
		   front=front.next;
		   this.size--;
		   return rv;
		   
	   }
	}
// Function for calculating the size of queue
	public int size(){
		return this.size;
	}
// Function for determining is the queue empty or not
	public boolean isEmpty(){
		return this.size==0;
	}
// Function for getting the front of queue
	public Integer top(){
		if(this.size==0)
			return null;
		else
			return this.front.data;
		
	}
// Function for displaying the queue
	public void display(){
		for(Node i=this.front;i!=null;i=i.next){
			System.out.print(i.data+" => ");
		}
		System.out.println("END ");
	}
	



}
