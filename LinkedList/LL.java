package LinkedList;

public class LL {
	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;
	public LL(){
		this.head=null;
		this.tail=null;
		this.size=0;
	}

	public void addFirst(int data) {
		Node newNode = new Node(data);
		if (this.head == null) {
			this.head=newNode;
			this.tail=newNode;
		} else {
			newNode.next = this.head;
			this.head = newNode;
		}
		this.size++;
	}

	public void addLast(int data) {
		Node newNode=new Node(data);
		if(this.tail==null){
			this.head=newNode;
			this.tail=newNode;
		}
		else{
			this.tail.next=newNode;
			this.tail=newNode;
		}
		this.size++;

	}

	public void addBtw(int data, int pos) {
		if(pos==1){
			this.addFirst(data);
		}
		else if(pos==this.size+1)
			this.addLast(data);
		else{
			Node newNode=new Node(data);
			Node i=this.head;
			for(int j=1;j<pos-1;j++){
				i=i.next;
			}
			newNode.next=i.next;
			i.next=newNode;
		}
		this.size++;
	}
	public void dislay(){
		Node i=this.head;
		while(i!=null){
			System.out.print(i.data+"=>");
			i=i.next;
		}
		System.out.println("END");
	}
    public Integer removeFirst(){
    	if(this.head==null)
    		return null;
    	else{
    		int rv=this.head.data;
    		this.head=this.head.next;
    		this.size--;
    		return rv;
    	}
    }
    public Integer removeLast(){
    	if(this.head==null)
    		return null;
    	else{
    		if(this.head.equals(this.tail)){
    			return this.removeFirst();
    		}
    		int rv=this.tail.data;
    		Node i;
    		for(i=this.head;i.next!=this.tail;i=i.next){
    		}
    		this.tail=i;
    		this.tail.next=null;
    		this.size--;
    		return rv;
    	}
    	
    }
    public Integer removeBtw(int pos){
    	if(pos==1){
    		return this.removeFirst();
    	}
    	else if(pos==this.size)
    		return this.removeLast();
    	else{
    		Node i=this.head;
    		for(int j=1;j<pos-1;j++){
    			i=i.next;
    		}
    		Node del=i.next;
    		int rv=del.data;
    		i.next=del.next;
    		del=null;
    		this.size--;
    		return rv;
    		
    	}
    }
}
