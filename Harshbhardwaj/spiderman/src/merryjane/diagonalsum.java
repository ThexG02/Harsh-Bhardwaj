package merryjane;

public class diagonalsum {
	public static void diagonalsum(int matrix [][]) {
		int sum=0;
		int sumpd=0;
		int sumsd=0;
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
			
				if(i==j) {
					sumpd+=matrix[i][j];
				}
				else if(i+j==matrix.length-1) {
					sumsd+=matrix[i][j];
				}
			}
		}
		sum=sumsd+sumpd;
		System.out.println("the sum of diagonals is :" + sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mat[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
diagonalsum(mat);
	}

}
