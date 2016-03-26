import java.util.ArrayList;


public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2};
		System.out.println(new RemoveElement().removeElement(nums, 3));
	}

	 public int removeElement(int[] nums, int val) {
	      int i = 0,size = 0;
	      for(; i < nums.length; i++){
	    	  if(nums[i] != val){
	    		  nums[size++] = nums[i];
	    	  }
	      }
	      return size;
	 }
}
