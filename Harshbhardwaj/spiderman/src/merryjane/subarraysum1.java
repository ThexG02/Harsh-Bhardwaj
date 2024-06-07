package merryjane;

public class subarraysum1 {

	public static void subarray(int arr[]) {
	
		int maxsum = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int sum = 0;
				for (int k = i; k <= j; k++) {
					sum += arr[k];
					//System.out.print(arr[k]+" ");
					
				}
				System.out.println("subarray sum:" + sum);
				if (maxsum < sum) {
					maxsum = sum;
				}
				System.out.println();
			}
System.out.println();
		}
		System.out.println(maxsum);
	}

	public static void main(String[] args) {
		int arr1[] = { 2, 4, 6, 8, 10 };
		subarray(arr1);
	}

}
