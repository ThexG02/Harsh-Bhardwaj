package merryjane;

public class sldrohmbs {
public static void sldrhmbs(int n) {
	for(int i=1;i<=n;i++) {
		// space
		for(int j=1;j<=n-i  ;j++) {
			System.out.print(" ");
		}
		//stars
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
	public static void main(String[] args) {
		sldrhmbs(5);
	}

}
