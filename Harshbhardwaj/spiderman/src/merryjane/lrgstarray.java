package merryjane;

import java.util.*;

public class lrgstarray {
	public static void largest(int arr[]) {
		int lrg = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > lrg) {
				lrg = arr[i];
			} else {
				continue;
			}
		}
		System.out.println("largest value: " + lrg); 
	}

	public static void main(String[] args) {
		int arr1[] = { 34, 1, 2, 3, 4, 5, 65 };
		largest(arr1);
	}

}
