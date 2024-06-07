package merryjane;

import java.util.Scanner;

public class calcswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the operands");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("enter your choice");
		int num = sc.nextInt();
		switch (num) {
		case 1:
			System.out.println("addition = ");
			System.out.println(a + b);
			break;
		case 2:
			System.out.println("sub = ");
			System.out.println(a - b);
			break;
		case 3:
			System.out.println("mult = ");
			System.out.println(a * b);
			break;
		case 4:
			System.out.println("division = ");
			System.out.println((int) (a / b));
			break;
		default:
			System.out.println("wrong chouce");

		}

	}

}
