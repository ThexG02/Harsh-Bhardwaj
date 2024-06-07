package merryjane;

import java.util.Scanner;

public class loopd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int num = sc.nextInt();
			if (num % 10 != 0) {
				System.out.println(num);
			} else {
				System.out.println("out of loop");
				break;
			}
		}
	}

}
