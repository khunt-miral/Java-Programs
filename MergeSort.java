import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		int[]a=mergeSort(arr,0,arr.length-1);
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}

	}
	public static int[] mergeSort(int[]arr,int start,int end){
		if(start>=end){
			int[]ar=new int[1];
			ar[0]=arr[start];
			return ar;
		}
			int mid=(start+end)/2;
			int[]left=mergeSort(arr,start,mid);
			int[]right=mergeSort(arr,mid+1,end);
			int[]sorted=merge(left,right);
			return sorted;
		
	}
	public static int[] merge(int[]left,int[]right){
		int i=0,j=0,k=0;
		int []sorted=new int[left.length+right.length];
		while(i<left.length && j<right.length){
			if(left[i]<right[j]){
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

}
