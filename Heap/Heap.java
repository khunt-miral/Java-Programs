package Heap;

import java.util.ArrayList;
import java.util.HashMap;

public class Heap {
	private ArrayList<Integer>data;
	private HashMap<Integer, Integer>posMmap;
	private boolean isMin;
	
	public Heap(boolean isMin){
		this.isMin=isMin;
		this.data=new ArrayList<>();
		this.posMmap=new HashMap<>();
	}
	public void add(int item){
		this.data.add(item);
		this.posMmap.put(item, this.data.size()-1);
		this.upHeapify(this.data.size()-1);
	}
	public void upHeapify(int ci){
		if(ci==0){
			return;
		}
		else{
			int pi=(ci-1)/2;
			if(this.data.get(pi)<this.data.get(ci)){
				swap(pi,ci);
				this.upHeapify(pi);
			}
		}
	}
	public void swap(int pi,int ci){
		
	}
	public void downHeapify(){
		
	}

}
