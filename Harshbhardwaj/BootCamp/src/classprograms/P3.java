package classprograms;

public class P3 {
	 public static void sortColors(int[] nums) {
	        int c0=0;
	        int c1=0;
	        int c2=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]==0){
	                c0++;
	            }
	            else if(nums[i]==1) {
	                c1++;
	            }
	            else {
	            	c2++;
	            }

	        }
	        for(int j=0;j<nums.length;j++){
	        if(j<c0){
	            nums[j]=0;
	        }
	        else if(j<c0+c1){
	            nums[j]=1;

	        }
	        else{
	            nums[j]=2;
	        }
	        }
	        for(int k=0;k<nums.length;k++){
	           System.out.print(nums[k]);
	        }

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,0,2,1,1,0};
		sortColors(a);
	}

}
