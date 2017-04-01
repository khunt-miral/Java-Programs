import java.util.ArrayList;
import java.util.Scanner;

public class Array_SubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		permute(arr,0,"[");

	}
	private static void permute(int[]arr,int si,String osf){
		if(si==arr.length)
		{
			System.out.println(osf+" END]");
			return;
		}
		permute(arr,si+1,osf+arr[si]+", ");
		permute(arr,si+1,osf);
		
	}

}
