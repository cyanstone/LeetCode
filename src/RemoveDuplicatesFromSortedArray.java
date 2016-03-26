
public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 0,0,1,1,2,2,3,3,4,4,5,5,5,6,6,6,7 };
		System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums) {
		int j = 0;
       for(int i = 1; i < nums.length; i++){
    	   if(nums[i] != nums[i - 1]){
    		   nums[j] = nums[i];
    		   j++;
    	   } 
       }
       return j;
    }
}
