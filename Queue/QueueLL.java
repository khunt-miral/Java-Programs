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
	public int size(){
		return this.size;
	}
	public boolean isEmpty(){
		return this.size==0;
	}
	public Integer top(){
		if(this.size==0)
			return null;
		else
			return this.front.data;
		
	}
	public void display(){
		for(Node i=this.front;i!=null;i=i.next){
			System.out.print(i.data+" => ");
		}
		System.out.println("END ");
	}
	



}
