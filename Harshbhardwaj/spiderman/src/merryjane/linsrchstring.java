package merryjane;

import java.util.Scanner;

public class linsrchstring {
	public static void linsrchstr(String name[], String naam) {
		int count = 0;
		for (int i = 0; i < name.length; i++) {
			if (name[i].equals(naam)) {
				count++;
				break;
			} else {
				continue;
			}
		}
		if (count == 0) {
			System.out.println("not found");
		} else {
			System.out.println(" found");
		}
	}

	public static void main(String[] args) {
		String names[] = new String[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.next();
		}
		System.out.println("enter the name to search:");
		String nam = sc.next();
		linsrchstr(names, nam);
	}

}
