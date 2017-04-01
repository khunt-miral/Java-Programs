package dp;

import java.util.Scanner;

public class WordWrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // no. of words
		String[] arr = new String[n]; // Words array
		for (int i = 0; i < n; i++) {
			arr[i] = scn.next(); // taking word input from user
		}
		int limit = scn.nextInt();
		wordWrap(arr, limit);

	}

	public static void wordWrap(String[] words, int limit) {
		int[][] space = new int[words.length + 1][words.length + 1];
		for (int i = 0; i <= words.length; i++) {
			int sum = 0;
			for (int j = i; j <= words.length; j++) {
				if (i == 0) {
					space[i][j] = 0;
					continue;
				}
				sum += words[j - 1].length();
				if (sum + j - i > limit) {
					space[i][j] = Integer.MAX_VALUE;
				} else {
					space[i][j] = (int) Math.pow(limit - sum - j + i, 2);
				}
			}
		}
		for (int i = 0; i <= words.length; i++) {
			for (int j = 0; j <= words.length; j++) {
				System.out.print(space[i][j] + " ");
			}
			System.out.println();
		}
		int[] c = new int[words.length + 1];
		int[] p = new int[words.length + 1];
		c[0]=0;
		for (int j = 1; j <= words.length; j++) {

			c[j] = Integer.MAX_VALUE;
			for (int i = 1; i <= j; i++) {
				if (c[i - 1] != Integer.MAX_VALUE && space[i][j] != Integer.MAX_VALUE
						&& (c[i - 1] + space[i][j] < c[j])) {
					c[j] = c[i - 1] + space[i][j];
					p[j] = i;
				}
			}
		}

		for (int i = 0; i < words.length + 1; i++) {
			System.out.print(c[i] + " ");
		}
		print(p, words.length);
	}

	public static int print(int[] p, int n) {
		int k;
		if (p[n] == 1)
			k = 1;
		else
			k = print(p, p[n] - 1) + 1;
		System.out.println("Line number" + k + ": From word no." + p[n] + "to" + n);
		return k;
	}

}
