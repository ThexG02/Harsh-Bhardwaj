package merryjane;

public class SDESHEETP1 {
// SET MATRIXZERO
	public static void check(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if (arr[i][j]==0) {
					set(arr,i,j);
					break;
				}
				else {
					continue;
				}
			}
		}
	}
	public static void set(int arr[][],int i ,int j) {
		for(int k=0;k<arr.length;k++) {
			arr[i][k]=0;
			arr[k][j]=0;
		}
		for(int m=0;m<arr.length;m++) {
			for(int n=0;n<arr.length;n++) {
				System.out.print(arr[m][n]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {{1,2,3},{4,0,5},{6,7,0}};
check(arr);
	}

}
