package merryjane;

public class insertionsrt {
public static void insrtnsrt(int arr[]) {
	for(int i=0;i<arr.length-1;i++) {
		int min=i;
		for(int j=i+1;j<arr.length;j++) { 
			if(arr[min]>arr[j]) {
				min=j;
			}
		}
		int temp=arr[min];
		arr[min]=arr[i];
		arr[i]=temp;
	}
	for(int k=0;k<arr.length;k++) {
		System.out.print(arr[k]);
	}
}
	public static void main(String[] args) {
int arr1[]= {5,4,3,1,2};
insrtnsrt(arr1);
	}

}
