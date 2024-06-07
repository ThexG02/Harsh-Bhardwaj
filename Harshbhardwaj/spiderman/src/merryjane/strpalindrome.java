package merryjane;

public class strpalindrome {
public static boolean strpalindrome(String str) {
	//String str1;
	//for(int i=str.length();i>=0;i--) {
		for(int i=0;i<str.length();i++) {
			int n=str.length();
			if(str.charAt(i)!=str.charAt(n-1-i)){
				return false;
					
			}
			
		}
		return true;
		
	}
	

	public static void main(String[] args) {
String st= "racecar";
System.out.println(strpalindrome(st));
	}

}
