package merryjane;

public class array2 {
public static void keyage(int key[]) {
	for(int i=0;i<key.length;i++) {
	key[i]=((key[i]*10) +5);
	}
}

	public static void main(String[] args) {
		int age[] = { 12, 34, 56, 76, 98, 90 };
		keyage(age);
		for(int j=0;j<age.length;j++)
		{
			System.out.println("agekey: " + age[j]);
		}

	}

}
