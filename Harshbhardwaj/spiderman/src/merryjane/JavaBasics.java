package merryjane;

public class JavaBasics {
	public static void reversearr(int arr[]) {
		int temp = 0, i = 0;
		int n = arr.length-1;
		while (i<n) {
			temp = arr[i];
			arr[i] = arr[n];
			arr[n] = temp;
			i++;
			n--;
		}
		
	}

	public static void main(String[] args) {		// TODO Auto-generated method stub
int arr1[]= {1,2,3,4,5};
	reversearr(arr1);
	for (int j = 0; j < arr1.length; j++) {

		System.out.print(arr1[j]);
	}

}
}