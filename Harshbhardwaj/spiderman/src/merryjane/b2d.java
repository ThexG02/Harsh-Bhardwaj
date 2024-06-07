package merryjane;

import java.util.Scanner;

public class b2d {
	public static void bitodec(int num) {
		int b=num;
		int pav=0;
		int dec=0;
		int ld=0;
		while(b>0)
		{
			ld=b%10;
			b=b/10;
			dec=(int) (dec+(ld*Math.pow(2,pav)));
			pav++;
			
		}
		System.out.println(dec);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num=sc.nextInt();
		bitodec(num);

	}

}
