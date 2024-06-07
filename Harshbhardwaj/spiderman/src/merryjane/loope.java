package merryjane;

import java.util.Scanner;

public class loope {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int sume=0;
		int sumo=0;
		for(int i =0;i<=num;i++)
		{
			if(i%2==0)
			{
				sume+=i;
			}
			else {
				sumo+=i;
			}
		}
		System.out.println(sume);
		System.out.println(sumo);
		}

}
