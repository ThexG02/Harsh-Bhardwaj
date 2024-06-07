package merryjane;

import java.util.Scanner;

public class binocoeff {
	public static int fact(int n) {
		int facto = 1;
		for (int i = 1; i <= n; i++) {
			facto = facto * i;

		}
		// System.out.println(facto);
		return facto;

	}

	public static int binocof(int n, int r) {
		int nf = fact(n);
		int rf = fact(r);
		int nmrf = fact(n - r);
		int x = (nmrf) * (rf);
		int coff = (nf / x);
		System.out.println(coff);

		return 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		binocof(n, r);

	}

}
