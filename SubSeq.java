import java.util.Scanner;

public class SubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		subSeq(s, "");

	}

	// SubSequence Printing Recursive Solution Complexity -> O(2^n)
	private static void subSeq(String s, String osf) {
		if (s.length() == 0) {
			System.out.println(osf);
			return;
		}
	    String ros=s.substring(1);
	    subSeq(ros,osf+s.charAt(0));
		subSeq(ros,osf+"");
	}

}
