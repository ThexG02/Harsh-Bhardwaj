package merryjane;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("enter your choice\n1.add\n2.sub\n3.mult\n4.div");
		int ch = sc.nextInt();
		if (ch == 1) {
			System.out.println(a + b);
		} else if (ch == 2) {
			System.out.println(a - b);
		} else if (ch == 3) {
			System.out.println(a * b);
		} else if (ch == 4) {
			System.out.println(a / b);
		} else {
			System.out.println("bhai main toh toot gaya");
		}

	}

}
