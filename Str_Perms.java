import java.util.Scanner;

public class Str_Perms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		permute(s,"");

	}
	// Function to find permutations of string using recursive approach
	public static void permute(String s,String osf){
		if(s.length()==0)
		{
			System.out.println(osf);
			return;
		}
		for(int i=0;i<s.length();i++){
			permute(s.substring(0, i)+s.substring(i+1),osf+s.charAt(i));
		}
		
	}

}
