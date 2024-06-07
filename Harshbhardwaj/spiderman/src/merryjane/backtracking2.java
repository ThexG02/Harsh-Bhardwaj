package merryjane;

public class backtracking2 {
	public static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void bctrk(int arr[], int val,int i) {
		if(i==arr.length) {
			printarr(arr);
		return;}
		arr[i]=val;
		bctrk(arr,val+1,i+1);
		arr[i]=arr[i]-2;
		System.out.println();
		
		
	}
	public static void main(String[] args) {
		int arr[]= new int[5];
		bctrk(arr,1,1);
		printarr(arr);
	}

}
