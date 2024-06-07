package merryjane;

import java.util.Scanner;

public class incometax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ypur income in lakhs");
		int incm = sc.nextInt();
		int tax;
		if (incm < 5) {
			tax = 0;
			System.out.println("no need to pay the tax");

		} else if (incm >= 5 && incm <= 10) {
			tax = (int) (0.2 * incm);
			System.out.println("your tax is:" + tax + " lakhs");
		} else {
			tax = (int) (0.3 * incm);
			System.out.println("yor tax is:" + tax + " lakhs");
		}
	}

}
