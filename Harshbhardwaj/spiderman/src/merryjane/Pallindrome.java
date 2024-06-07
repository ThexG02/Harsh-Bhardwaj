package merryjane;

public class Pallindrome {

	public static void main(String[] args) {
		int n=543451;
		int p=n;
		int x=0;
		int sum=0;
		while (n>0)
		{
			x=n%10;
			sum=(sum*10)+x;
			n=n/10;
		}
		if(p==sum) {
		System.out.println("yess");
		}
		else {
			System.out.println("not");
		}
	}

}
