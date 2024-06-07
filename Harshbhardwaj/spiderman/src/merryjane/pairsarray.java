package merryjane;

public class pairsarray {
public static void pairarr(int arr[]) {
	int tp=0;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		System.out.print("("+arr[i]+","+arr[j]+")");
		tp++;
	}
	System.out.println();
}
System.out.println("total pairs:"+tp);
}
	public static void main(String[] args) {
int arr1[]= {1,2,3,4,5};
pairarr(arr1);
	}

}
