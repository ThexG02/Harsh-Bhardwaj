package merryjane;

public class backtracking {
public static void changearr( int arr[],int i,int val) {
	//base case
	if(i==arr.length) {
		//printarr(arr);
		System.out.println();
		return;
	}
	//backtracking
	arr[i]=val;
	changearr(arr,i+1,val+1);
	arr[i]=arr[i]-2;
	
}
public static void subset(String arr,String ans,int i) {
	//base case
	if(i==arr.length()) {
		System.out.println(ans);
		return;
	}
	//backtracking 
		//yes
		subset(arr,ans+arr.charAt(i),i+1);
		//no
		subset(arr,ans,i+1);
}
public static void printarr(String arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		
		
	}
}
	public static void main(String[] args) {
String arr= "abc";
subset(arr,"",0);
//printarr(arr);
	}

}
