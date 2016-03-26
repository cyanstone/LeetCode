import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i ++){
			nums[i] = in.nextInt();
		}
		System.out.println(new ContainsDuplicate().containsDuplicate(nums));
	}

	 public boolean containsDuplicate(int[] nums) {
		 
		Set<Integer> unique = new HashSet<>();
		for(int i = 0 ; i < nums.length;i++){
			if(unique.contains(nums[i])){
				return true;
			} else {
				unique.add(nums[i]);
			}
		}
		 return false;
	 }
	 
	 
	 public boolean containsDuplicateOfTimeOut(int[] nums) {
		 if(nums == null) return false;
	       for(int i = 0; i < nums.length; i++) {
	    	   for(int j = i + 1; j < nums.length; j++) {
	    		   if(nums[i] == nums[j]) {
	    			   return true;
	    		   } 
	    	   }
	       }
	       return false;
	}
}
