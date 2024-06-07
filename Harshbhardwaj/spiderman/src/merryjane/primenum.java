package merryjane;

import java.util.Scanner;

public class primenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num_factors = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				num_factors++;
			}
		}
		if (num_factors == 2) {
			System.out.println("Prime");
		} else
			System.out.println("Not Prime");

	}

}
