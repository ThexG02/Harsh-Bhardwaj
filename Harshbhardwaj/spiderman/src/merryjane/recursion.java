package merryjane;

public class recursion {
	public static void printnnum(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		System.out.print(n + " ");
		printnnum(n - 1);
	}

	public static void print1tonnum(int n) {
		if (n == 1) {
			System.out.print(n);
			return;
		}
		print1tonnum(n - 1);
		System.out.print(n);
	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int sumofn(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		}
		return n + sumofn(n - 1);
	}

	public static int fibbo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fnm1 = fibbo(n - 1);
		int fnm2 = fibbo(n - 2);
		int fn = fnm1 + fnm2;
		return fn;

	}

	public static boolean issorted(int arr[], int i) {

		if (i == arr.length - 1) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;
		}
		return issorted(arr, i + 1);
	}

	public static int firstocrn(int arr[], int key, int i) {

		if (i == arr.length - 1) {
			return -1;
		}
		if (arr[i] == key) {
			return i;
		}
		return firstocrn(arr, key, i + 1);
	}

	public static int lastocrn(int arr[], int key, int i) {

		if (i == arr.length - 1) {
			return -1;
		}
		int isfound= lastocrn(arr,key,i+1);
		if(isfound!=-1 && arr[i]==key) {
			return i;}
		return isfound;
		}
		
	

	public static void main(String[] args) {
		int n = 5;
		// print1tonnum(n);
		// System.out.print(factorial(n));
		// System.out.println(sumofn(n));
		// System.out.println(fibbo(25));
		int ar[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
		System.out.println(lastocrn(ar, 5, 0));
	}

}
