package merryjane;

import java.util.Scanner;

public class linearsearch {
	public static void linsrch(int rol[],int key)
	{ int count=0;
		for(int j=0;j<rol.length;j++) {
			if(rol[j]==key)
			{
				count++;
				break;
			}
	

			else {
				
				continue;
			}
		}
		if(count==0) {
			System.out.println(" not found");
		}
		else {
			System.out.println("found");
		}
	}

	public static void main(String[] args) {
int roll[]=new int[5];
Scanner sc=new Scanner (System.in);
for(int i=0;i<roll.length;i++)
{
	roll[i]=sc.nextInt();
}
int num;
System.out.println("enter the number to search: ");
num=sc.nextInt();
linsrch(roll,num);

	}

}
