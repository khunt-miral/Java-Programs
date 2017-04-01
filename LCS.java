import java.util.Scanner;

public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s1=scn.next();
		String s2=scn.next();
		System.out.println(lcs_naive(s1,s2));
		System.out.println(lcs_dp(s1,s2));

	}
	// Naive Solution 
	
	private static int lcs_naive(String s1,String s2){
		if(s1.length()==0 ||s2.length()==0)
			return 0;
		String ros1=s1.substring(1);
		String ros2=s2.substring(1);
		if(s1.charAt(0)==s2.charAt(0))
			return 1+lcs_naive(ros1,ros2);
		else{
			return Math.max(lcs_naive(s1, ros2),lcs_naive(ros1, s2));
		}
	}
	 
	// Dynamic Programming Solution  Complexity -> O(n^2)
	
	private static int lcs_dp(String s1,String s2){
		int[][]arr=new int[s1.length()+1][s2.length()+1];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				if(j==0 ||i==0)
					arr[i][j]=0;
				else{
					if(s1.charAt(i-1)==s2.charAt(j-1)){
						arr[i][j]=arr[i-1][j-1]+1;
					}
					else{
						arr[i][j]=Math.max(arr[i-1][j], arr[i][j-1]);
					}
				}
			}
		}
		return arr[s1.length()][s2.length()];
	}

}
