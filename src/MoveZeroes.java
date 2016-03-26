
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroes move = new MoveZeroes();
		int[] nums = new int[]{0, 1, 0, 3, 12};
		move.moveZeroes(nums);
		move.moveZeroes2(nums);
	}
	
	public void moveZeroes(int[] nums) {
		int[] offset = new int[nums.length];
		int numsOfZeroes = 0;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0 && i != nums.length-1){
        		numsOfZeroes++;
        		for(int j = i + 1; j < nums.length; j++){
        			offset[j]++;
        		}
        	}
        }
        for(int i = 0; i < nums.length; i++){
        	nums[i - offset[i]] = nums[i];
        }
        for(int i = nums.length - 1; i > nums.length - 1 - numsOfZeroes; i--){
        	nums[i] = 0;
        }
    }
	
	/**
	 * 
	 */
	public void moveZeroes2(int[] nums){
		   int cnt = 0, pos = 0;
	        // 将非0数字都尽可能向前排
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] != 0){
	                nums[pos]= nums[i];
	                pos++;
	            }
	        }
	        // 将剩余的都置0
	        for(;pos<nums.length; pos++){
	            nums[pos] = 0;
	        }
	        for(int i : nums){
	        	System.out.println(i);
	        }
	}
}
