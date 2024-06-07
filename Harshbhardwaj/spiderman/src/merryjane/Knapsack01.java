package merryjane;

public class Knapsack01 {
	public static int Knapsack1(int val[], int wt[], int w, int n) {
		if ((w == 0) || (n == 0)) {
			return 0;
		}
		if (wt[n - 1] <= w) // valid
		{   // include
			int ans1 = val[n - 1] + Knapsack1(val, wt, w - wt[n - 1], n - 1);
			// eclude
			int ans2 = Knapsack1(val, wt, w, n - 1);
			return Math.max(ans1, ans2);
		} else {
			return Knapsack1(val, wt, w, n - 1);
		}
	}
public static int Knapsack2(int val[], int wt[],int w,int n, int dp[][]) {
	if((w==0)||(n==0)) {
		return 0;
	}
	if(dp[n][w]!=-1) {
		return dp[n][w];
	}
	if(wt[n-1]<=w) {// valid
		//include
		int ans1=val[n-1]+Knapsack2(val,wt,w-wt[n-1],n-1,dp);
		//exclude
		int ans2=Knapsack2(val,wt,w,n-1,dp);
		dp[n][w]=Math.max(ans1, ans2);
		return dp[n][w];
	}
	else {
		dp[n][w]=Knapsack2(val,wt,w,n-1,dp);
		return dp[n][w];
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[]= {15,14,10,45,30};
		int wt[]= {2,5,1,3,4};
		int w=7;
		int dp[][]= new int[val.length+1][w+1];
		for(int i=0;i<dp.length;i++) {
			for(int j=0;j<dp[0].length;j++) {
				dp[i][j]=-1;
			}
		}
		System.out.println(Knapsack1(val,wt,w,val.length));
		System.out.println(Knapsack2(val,wt,w,val.length,dp));
	}

}
