package merryjane;

import java.util.Scanner;

public class array1 {

	public static void main(String[] args) {
int numbers[]=new int[20];
Scanner sc= new Scanner(System.in);
for(int i=0;i<3;i++) {
	numbers[i]=sc.nextInt();
	}
for(int i=0;i<3;i++) {
	System.out.println(numbers[i]);
}
	}

}
