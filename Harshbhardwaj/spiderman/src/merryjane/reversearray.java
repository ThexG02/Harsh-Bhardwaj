package merryjane;

public class reversearray {
	public static void arrrev(int arr[]) {
		int temp = 0, i = 0;
		int n = arr.length-1;
		while (i<n){
			temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
			i++;
			n--;
		}
		
	}

	public static void main(String[] args) {
		int arr1[] = { 2, 4, 6, 8,10 };
		arrrev(arr1);
		for (int k = 0; k < arr1.length; k++) {
			System.out.print(arr1[k]+" ");
		}
	}

}
