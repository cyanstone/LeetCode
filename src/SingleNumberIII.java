import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class SingleNumberIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] nums = new int[] {1,2,3,4,5,6,7,8,9,10,11,9,8,7,6,5,4,3,2,1};
			System.out.println(Arrays.toString(new SingleNumberIII().singleNumber(nums)));
	}
	
	public int[] singleNumber(int[] nums) {
       if(nums.length == 2) return nums;
       int[] result = new int[2];
       Map<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i = 0; i < nums.length; i++) {
    	   if(map.containsKey(nums[i])) {
    		   map.put(nums[i], 2);
    	   } else {
    		   map.put(nums[i], 1);
    	   }
       }
       Iterator it = map.entrySet().iterator();
       int i = 0;
       while(it.hasNext()) {
    	   Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) it.next();
    	   if(entry.getValue() == 1) {
    		   result[i] = entry.getKey();
    		   i++;
    	   }
       }
       return result;
    }
}
