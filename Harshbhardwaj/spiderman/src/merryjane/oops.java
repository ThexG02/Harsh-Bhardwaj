package merryjane;

class pen {
	String color;
	int tipsz;
	String company;
	int data[];

	pen(String color, int tipsz) {
		data = new int[3];

		this.color = color;
		this.tipsz = tipsz;
	}

	pen(String com) {
		data = new int[3];

		this.company = com;
	}

	pen(pen p1) {
		data = new int[3];
		this.color = p1.color;
		this.company = p1.company;
		this.tipsz = p1.tipsz;
		this.data=p1.data;

	}
}

public class oops {

	public static void main(String[] args) {
		pen p1 = new pen("yellow",10);
		
		p1.color="red";
		p1.tipsz=23;
		p1.company="rorito";
		for(int i=0;i<3;i++) {
		p1.data[i]=1;
		p1.data[1]=3;
		p1.data[2]=5;
		pen p2=new pen(p1);
		System.out.println(p2.color);
		System.out.println(p2.tipsz);
		System.out.println(p2.company);
		for(int j=0;j<3;j++) {
			System.out.println(p2.data[j]);
		}
		p1.data[i]=1;
		p1.data[1]=3;
		p1.data[2]=34;
		for(int k=0;k<3;k++) {
			System.out.println(p2.data[k]);
		
		}
		p1.color="green";
		p1.tipsz=12;
		p1.company="flair";
		p2.company="natraj";
		System.out.println(p1.color);
		System.out.println(p1.tipsz);
		System.out.println(p1.company);
		System.out.println();
		System.out.println(p2.color);
		System.out.println(p2.tipsz);
		System.out.println(p2.company);
	 
	}
	}
}
