
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {0,1,3};
		System.out.println(missingNumber(array));
	}
	
	public static int missingNumber(int[] nums) {
		int length = nums.length;
		if(length < 1) return 0;
		int sum = length * (length + 1) / 2;
		int sum2 = 0;
		for(int i = 0; i < length; i++) {
			sum2 += nums[i];
		}
		return sum - sum2;
	}

}
