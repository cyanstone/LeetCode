
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {1,3,5,6};
		int target = 0;
		System.out.println(searchInsert(array, target));
	}
	
	public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if(nums == null || length <= 0){ return -1;}
        else if(target < nums[0]) {return 0;}
        else if(target > nums[length - 1]) {return length;}
        else if(length == 1) {return 0;}
        else {
        	for(int i = 0; i < length -1; i++) {
        	if(target == nums[i]) {
        		return i;
        	} else {
        		if(nums[i] < target && nums[i+1] < target) {
        			continue;
        		} else if(nums[i] < target && nums[i+1] >= target){
        			return i+1;
        		}
        	}
        }
        }
        return Integer.MIN_VALUE;
    }
}
