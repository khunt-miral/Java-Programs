package Queue;

public class QueueArray {
	private int []arr;
	private int front;
	private int rear;
	public QueueArray(){
		this.front=-1;
		this.rear=-1;
		this.arr=new int[10];
	}
	public void enqueue(int data){
		if(this.rear==-1){
			
			this.rear++;
			this.front++;
			this.arr[this.rear]=data;
		}
		else{
			this.rear++;
			this.arr[this.rear]=data;
	
		}
	}
	public int dequeue(){
		if(this.front==-1){
			return -1;
		}
		else{
			int rv=this.arr[this.front];
			this.front++;
			return rv;
			
		}
	}
	public int size(){
		return this.rear-this.front+1;
	}
	public int top(){
		if(this.front==0){
			return -1;
		}
		else{
			return this.arr[this.front];
		}
	}
	public void display(){
		int i=this.front;
		while(i<this.rear){
			System.out.print(this.arr[i]+", ");
			i++;
		}
		System.out.println("END");
	}
	public boolean isEmpty(){
		return this.size()==0;
	}

}
