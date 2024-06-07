package merryjane;

import java.util.Scanner;

public class loopc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to find the reverse");
		int n = sc.nextInt();
		while (n != 0) {
			int x = n % 10;
			System.out.print(x);
			n = n / 10;
		}
	}

}
