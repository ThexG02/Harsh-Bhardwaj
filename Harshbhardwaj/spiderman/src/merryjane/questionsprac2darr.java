package merryjane;

public class questionsprac2darr {
public static void pract(int matrix[][]) {
	int sum=0;
	//for(int i=0;i<matrix.length;i++) {
		for(int j=0;j<matrix[0].length;j++) {
			
				sum+=matrix[1][j];
			
		}
	
	System.out.println("count:"+sum);
}
	public static void main(String[] args) {
int mat[][]= {{10,7,7},{34,7,35},{7,7,7}};
pract(mat);
	}

}
