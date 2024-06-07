package classprograms;

public class p2 {
	public static int lo(int arr[], int key, int i) {
		if (i == arr.length) {
			return -1;
		}
		int isfound = lo(arr, key, i + 1);
		if (isfound == -1 && arr[i] == key) {
			return i;
		}
		return isfound;
	}

	public static void maxvalue(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	public static void secondmax(int arr[]) {
		int max = arr[0];
		int prev = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				prev=max;
				max = arr[i];
			}
			if (arr[i] > prev && arr[i] < max) {
				prev = arr[i];
			}
		}
		System.out.println(prev);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 4, 3, 5, 6 };
		// System.out.println(lo(a, 3, 0));
		// maxvalue(a);
		secondmax(a);
	}

}
