package merryjane;

public class shortestpathNSEWstr {
public static void shrtpth(String str){
	int x=0;
	int y=0;
	for(int n=0; n<str.length();n++) {
		if(str.charAt(n)== 'n'){
			y++;
		}
		else if(str.charAt(n)=='s') {
			y--;
		}
		else if(str.charAt(n)=='e') {
			x++;
		}
		else {
			x--;
		}
		
	}
	float x2=x*x;
	float y2=y*y;
	System.out.println( (float)Math.sqrt(y2+x2));
	
}
	public static void main(String[] args) {
String st="wneenesennn";
shrtpth(st);
	}

}
