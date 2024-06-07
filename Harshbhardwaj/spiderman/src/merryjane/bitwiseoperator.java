package merryjane;

public class bitwiseoperator {
	public static void evenodd(int num) {
		if ((num & 1) == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}

	public static void getibit(int num, int i) {
		if ((num & (1 << i)) == 0) {
			System.out.println("ith bit is 0");
		} else {
			System.out.println("ith bit is 1");
		}
	}

	public static int setibit(int num, int i) {
		int bitmsk = 1 << i;
		return num | bitmsk;
	}

	public static int clearbit(int num, int i) {
		int bitmsk = ~(1 << i);
		return num & bitmsk;
	}

	public static int updateibit(int num, int i, int val) {
		if (val == 0) {
			return clearbit(num, i);
		} else if (val == 1) {
			return setibit(num, i);
		} else {
			System.out.println("wrong choice");
			return 0010;
		}

	}

	public static void clearlastibits(int num, int i) {
		int bitmask = ~(0) << i;
		System.out.println(num & bitmask);
	}

	public static void is2powyn(int num) {
		if (((num & (num - 1)) == (0))) {
			System.out.println("yes the number is in 2 ki power");
		} else {
			System.out.println("no,the number is not in the 2 ki power");
		}
	}

	public static int cntsetbits(int num) {
		int count = 0;
		while (num >0) {
			if ((num & 1) != 0) {
				count++;
			}
			num = num >> 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// evenodd(16);

		// getibit(15, 7);
		// System.out.println(setibit(10,2));
		// System.out.println(clearbit(10,1));
		// System.out.println(updateibit(10,2,0));
		// clearlastibits(15,2);
		// is2powyn(16);
		System.out.println(cntsetbits(15));
	}

}
