package Array;

import java.util.Scanner;

public class SumPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		int[] a = mergeSort(arr, 0, arr.length - 1);
		pair(a,target);

	}
	public static void triplet(int[]a,int target){
		int left
		
	}

	public static void pair(int[] a, int target) {
		int left = 0, right = a.length - 1;
		while (left < right) {
			if (a[left] + a[right] > target) {
				right--;
			} else if (a[left] + a[right] < target) {
				left++;
			} else {
				System.out.println(a[left] + ", " + a[right]);
				
				left++;right--;
			}
		}
	}

	public static int[] mergeSort(int[] arr, int start, int end) {
		if (start >= end) {
			int[] ar = new int[1];
			ar[0] = arr[start];
			return ar;
		}
		int mid = (start + end) / 2;
		int[] left = mergeSort(arr, start, mid);
		int[] right = mergeSort(arr, mid + 1, end);
		int[] sorted = merge(left, right);
		return sorted;

	}

	public static int[] merge(int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		int[] sorted = new int[left.length + right.length];
		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				sorted[k] = left[i];
				i++;
			} else {
				sorted[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < left.length) {
			sorted[k] = left[i];
			i++;
			k++;
		}
		while (j < right.length) {
			sorted[k] = right[j];
			j++;
			k++;
		}
		return sorted;
	}

}
