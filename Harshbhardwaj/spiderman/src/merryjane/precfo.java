package merryjane;

import java.util.Scanner;

public class precfo {
	public static void agekey(int key[]) {
		for (int i = 0; i < key.length; i++) {
			key[i] = (key[i] * 10 + 5);
		}

	}

	public static void lsearch(int arr[], int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				System.out.println("found");
				break;
			} else {
				continue;
			}
		}
	}

	public static void lsstr(String arr[], String key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(key)) {
				System.out.println("found");
				break;
			} else {
				continue;
			}
		}
	}

	public static int bsrch(int arr[], int key) {
		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;

			if (arr[mid] == key) {

				return mid;
			} else if (arr[mid] < key) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return -1;
	}

	public static void arrrev(int arr[]) {
		int temp = 0, i = 0;
		int j = arr.length - 1;
		while (i < j) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

	public static void arrpair(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				System.out.print("(" + i + "," + j + ")");
			}
			System.out.println();
		}
	}

	public static void subarr(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k]);
				}
				System.out.println();

			}
			System.out.println();
		}
	}
	public static void maxsumsubarr(int arr[] ) {
		int sum=0;
		int maxval= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				 sum=0;
				for(int k=i;k<=j;k++) {
					
					sum=sum+arr[k];
				}
				System.out.print(sum);

				if(maxval<sum) {
					maxval=sum;
				}
			System.out.println();}
			
		System.out.println();}
		System.out.println(maxval);
	}
	public static void maxsumsubarr2(int arr[]) {
		int maxval= Integer.MIN_VALUE;
		int currsum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				currsum=arr[i]+arr[j];
			}
			//System.out.println(currsum);
			if(maxval<currsum) {
				maxval=currsum;
			}
		System.out.println();}
System.out.println(maxval);	}
	public static void arrprnt(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void quicksrt(int arr[]) {
		int pivot=arr.length-1;
		int i=-1;
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]<pivot) {
				int temp= arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
	public static void main(String[] args) {

		int age[] = { 6,10,8,2,4};
		int arr1[] = { 12, 34, 56, 78, 90 };
		String name[] = { "harsh", "bhardwaj", "sahil", "pahwa", "aastha", "arora" };
		// agekey(age);
		// lsearch(age, 96);
		// lsstr(name, "bhardwaj");
		// System.out.println(bsrch(arr1, 90));
		// arrrev(age);
		/*
		 * for (int k = 0; k < age.length - 1; k++) { System.out.print(" " + age[k] +
		 * " ");
		 */
		maxsumsubarr2(age);
		
	}
}

	