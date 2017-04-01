import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		quick_sort(arr, 0, arr.length-1);
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
	}
	public static void quick_sort(int[]arr,int start,int end){
		if(start>=end)
		  return ;
		int pindex=partiton(arr,start,end);
		quick_sort(arr, start, pindex-1);
		quick_sort(arr, pindex+1,end);
	}
	public static int partiton(int[]arr,int start,int end){
		
		int pivot=arr[end];
		int pindex=0;
		for(int i=start;i<end;i++){
			if(arr[i]<pivot){
			    int temp=arr[i];
			    arr[i]=pivot;
			    pivot=temp;
				pindex++;
			}
		}
		return pindex+1;
	}

}
