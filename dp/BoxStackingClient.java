package dp;

import java.util.Scanner;

public class BoxStackingClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		BoxStacking[]obj=new BoxStacking[n];
		for(int i=0;i<n;i++){
			System.out.println("ENTER THE HEIGHT,LENGTH,WIDTH OF BOX");
			int l=scn.nextInt();
			int w=scn.nextInt();
			int h=scn.nextInt();
			obj[i]=new BoxStacking(l,w,h);
		}
		for(int i=0;i<n;i++){
			System.out.println(obj[i].length+" "+obj[i].width+" "+obj[i].height);
		}
		BoxStacking[]sort=mergeSort(obj,0,obj.length-1);
        System.out.println("************************************************");
		for(int i=0;i<n;i++){
			System.out.println(sort[i].length+" "+sort[i].width+" "+sort[i].height);
		}

	}

	public static BoxStacking[] mergeSort(BoxStacking[]arr,int start,int end){
		if(start>=end){
			BoxStacking[]ar=new BoxStacking[1];
			ar[0]=arr[start];
			return ar;
		}
			int mid=(start+end)/2;
			BoxStacking[]left=mergeSort(arr,start,mid);
			BoxStacking[]right=mergeSort(arr,mid+1,end);
			BoxStacking[]sorted=merge(left,right);
			return sorted;
		
	}
	public static BoxStacking[] merge(BoxStacking[]left,BoxStacking[]right){
		int i=0,j=0,k=0;
		BoxStacking []sorted=new BoxStacking[left.length+right.length];
		while(i<left.length && j<right.length){
			if(left[i].area<right[j].area){
				sorted[k]=left[i];
				i++;
			}
			else{
				sorted[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length){
			sorted[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length){
			sorted[k]=right[j];
			j++;
			k++;
		}
		return sorted;
	}
	public static int countMaxHeight(BoxStacking[]arr){
		int 
		int i=0,j=0;
	}



}
