
public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = new int[] { 2,4,5,1,8,9,3,6,10,7 };
		System.out.println(new HouseRobber().rob(nums));
	}

	public int rob(int[] nums) {
		if(nums == null  || nums.length == 0) return 0;
	     int n = nums.length;
	     int [] dp = new int [n+1];
	     dp[0] = 0;
	     dp[1] = nums[0];
	     for(int i = 2; i < n + 1; i++){
	    	 dp[i] = Math.max(dp[i - 1],dp[i - 2] + nums[i - 1]);
	     }
	     return dp[n];
    }
}
