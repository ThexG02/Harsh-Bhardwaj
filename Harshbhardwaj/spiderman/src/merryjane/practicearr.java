package merryjane;

import java.util.Scanner;

public class practicearr {

	public static void lsearch(int arr1[], int key) {
		int c=0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == key) {
			c++;	
				break;
			}
			else {
				continue;
			}
		}
		if(c==0) {
			System.out.println("not found");
		}
		else {
			System.out.println("found");
		}
	}
	
	public static int binsearch(int arr[],int key) {
		int srt=0;
		int end=arr.length;
		int mid=(srt+end)/2;
		while(srt<=end) {
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<mid) {
				end=mid-1;
			}
			else {
				srt=mid+1;
			}
		}
		return -1;
	}
	public static void  bblsrt(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {6,5,3,4,1,2,65,98,34,13,0};
		//lsearch(arr,34);
		//System.out.println(binsearch(arr,45));
		bblsrt(arr);
	}

}
