package merryjane;

public class strcmprson {
public static StringBuilder strcmprs( String str) {
	StringBuilder sb = new StringBuilder("");
	for(int i=0;i<str.length();i++) {
	Integer count=1;
	while(i<str.length()&& str.charAt(i)==str.charAt(i+1)) {
		count++;
		i++;
	}
	sb.append(str.charAt(i));
	if(count>1) {
		sb.append(count);
	}
	}
	sb.toString();
	return sb;
}
	public static void main(String[] args) {
String str="aaaabbbdd";
System.out.println(strcmprs(str));	
	}

}
