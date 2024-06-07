package merryjane;

import java.util.Scanner;

public class dec2bin {
	public static void dectobin(int num) {
		int dec=num;
		int b=0;
		int pav=0;
		int rem=0;
		while(dec>0) {
			rem=dec%2;
			b=(int) (b+rem*Math.pow(10, pav));
			dec=dec/2;
			pav++;
			
		}
		System.out.println(b);
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		dectobin(num);
		

	}

}
