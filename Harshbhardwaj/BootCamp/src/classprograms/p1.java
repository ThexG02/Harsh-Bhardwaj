package classprograms;

public class p1 {
	public static void pname(int n) {
		if(n==0) {
		return;
		}
		System.out.println(n);
		
		pname(n-1);
		System.out.println(n);
	}
	public static int fact(int n) {
		if(n==1) {
			return n;
		}
		return n*fact(n-1);
	}
	public static int fibbo(int n) {
		//indexing of the resultant series starts from 0
		if(n==0||n==1) {
			return n;
		}
		int fn1=fibbo(n-1);
		int fn2=fibbo(n-2);
		int fn =fn1+fn2;
		return fn;
	}
	public static int sumdig(int n) {
		if(n==0) {
			return 0;
		}
		
		
		return n%10+sumdig(n/10);
	}
	public static void sumdigv(int n, int sum ) {
		if(n==0) {
			System.out.println(sum);
			return ;
		}
		int a =n%10;
		sum=sum+a;
		sumdigv(n/10,sum);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pname(5);
		//System.out.println(fibbo(5));
		//System.out.println(fact(5));
		//System.out.println(sumdig(1234));
		 sumdigv(1234,0);
		
	}

}
