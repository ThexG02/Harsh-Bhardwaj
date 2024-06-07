package merryjane;

import java.util.Scanner;

public class mularray2d {
	public static void arr() {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		//System.out.print(matrix.length +" "+matrix[0].length);
	}

	public static void main(String[] args) {
		arr();
	}

}
