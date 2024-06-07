package merryjane;

import java.util.Scanner;

public class loopa {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int j =1;
		int sum = 0;
		while (j <= n) {
			sum += j;
			j++;

		}
		System.out.println(sum);

	}

}
