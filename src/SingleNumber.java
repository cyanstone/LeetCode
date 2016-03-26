import java.util.HashMap;
import java.util.Iterator;


public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
        	if(map.containsKey(nums[i])) {
        		map.put(nums[i], 2);
        	} else {
        		map.put(nums[i], 1);
        	}
        }
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
        	int key = it.next();
        	if(map.get(key) == 1) {
        		return key;
        	} 
        }
		return 0;
    }
	
	public int singleNumber2(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;
	}
}
