
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(array));
	}
	
    public static int maxSubArray(int[] nums) {
        int maxSofar = nums[0], maxEndingHere = nums[0];
        for(int i = 1; i < nums.length; i++) {
        	maxEndingHere = Math.max(maxEndingHere + nums[i],nums[i]);
        	maxSofar = Math.max(maxEndingHere, maxSofar);
        }
        return maxSofar;
    }

}
