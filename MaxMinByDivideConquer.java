import java.util.Scanner;

public class MaxMinByDivideConquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		System.out.println(max_dc(arr, 0, arr.length-1));
		System.out.println(min_dc(arr, 0, arr.length-1));

	}
	// Calculating maximum in the array by divide and conquer 
	public static int max_dc(int[]arr,int start,int end){
		if(start+1==end)
		{
			return Math.max(arr[start], arr[end]);
		}
		
		int mid=(start+end)/2;
		int rv1=max_dc(arr, start, mid);
		int rv2=max_dc(arr,mid+1,end);
		return Math.max(rv1,rv2);
	}
	// Calculating minimum in the array by divide and conquer
	public static int min_dc(int[]arr,int start,int end){
		if(start+1==end)
		{
			return Math.min(arr[start], arr[end]);
		}
		
		int mid=(start+end)/2;
		int rv1=min_dc(arr, start, mid);
		int rv2=min_dc(arr,mid+1,end);
		return Math.min(rv1,rv2);
	}
	// Calculating maximum and minimum in single function by divide and conquer

	

}
