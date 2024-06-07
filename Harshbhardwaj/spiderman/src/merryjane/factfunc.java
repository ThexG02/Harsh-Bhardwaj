package merryjane;

public class factfunc {
public static int fact (int n)
{
	int facto=1;
	for(int i=1;i<=n;i++)
	{
		facto=facto*i;
		
	}
	System.out.println(facto);
	return 0;
	
}
	public static void main(String[] args) {
		fact(3);

	}

}
