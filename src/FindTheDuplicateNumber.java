import java.util.Arrays;

public class FindTheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10,1};
		System.out.println(findDuplicate(array));
		System.out.println(findDuplicate2(array));
	}
	
	public static int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] == nums[i+1])
				return nums[i];
		}
		return -1;
	}
	
	public static int findDuplicate2(int [] nums) {
		int length = nums.length;
		int low = 1, high = length - 1;
		int mid = 0;
		while(low < high) {
			mid = low + (high - low)/2;
			int c = count(nums,mid);
			if(c > mid) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return low;
	}
	
	private static int count(int [] nums,int mid) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] <= mid) result++;
		}
		return result;
	}

}
