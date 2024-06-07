package merryjane;

public class practicefr {
	public static int sumn(int n) {
		if (n == 0) {
			return 0;
		} else {
			return n + sumn(n - 1);
		}
	}

	public static void pnt1(int n) {
		if (n == 1) {
			System.out.println(n);
			;

		} else {
			System.out.print(n);
			pnt1(n - 1);
		}
	}

	public static void p1tn(int n) {

		if (n == 1) {
			System.out.print(n);
		} else {
			p1tn(n - 1);
			System.out.print(n);

		}

	}

	public static int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static int fibbo(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int fn1 = fibbo(n - 1);
		int fn2 = fibbo(n - 2);
		int fn = fn1 + fn2;
		return fn;
	}

	public static boolean issorted(int arr[], int i) {
		if (i == arr.length-1) {
			return true;
		}
		if (arr[i] > arr[i + 1]) {
			return false;

		}
		return issorted(arr,i+1);
		
	}
	public static int focc(int arr[], int key, int i) {
	if (i== arr.length) {
		return -1;
	}
	if(arr[i]==key)
	{
		return i;
	}
	return focc(arr,3,i+1);
		}
	public static int locc(int arr[], int key, int i) {
		if (i== arr.length) {
			return -1;
		}
		int isfound= locc(arr,3,i+1);
		if(isfound==-1&&arr[i]==key ) {
			return i;
			
		}
		
		return isfound;
			}
	public static int pow(int x ,int n) {
		if(n==1) {
		return x;
		}
		return x*pow(x,n-1);
	}
	public static void main(String[] args) {
		// System.out.println(sumn(5));
		// p1tn(5);
		// System.out.println(factorial(5));
		//System.out.print(fibbo(5));
		int arr[]= {1,2,3,4,3,5,6};
		//System.out.println(issorted(arr,0));
		//System.out.println(locc(arr,3,0 ));
		System.out.println(pow(2,10));
		System.out.println();

	}

}
