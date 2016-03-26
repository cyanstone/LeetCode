import java.util.HashMap;
import java.util.Iterator;


public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int majorityElement(int[] nums) {
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        for(int i = 0; i < nums.length; i++){
	        	if(map.containsKey(nums[i])) {
	        		int tmp = map.get(nums[i]);
	        		if(tmp++ > nums.length/2){
	        			return nums[i];
	        		} else {
	        			map.put(nums[i],tmp);
	        		}
	        	} else {
	        		map.put(nums[i], 1);
	        	}
	        }
	        Iterator it = map.keySet().iterator();
	        while(it.hasNext()){
	        	int key = (int)it.next();
	        	if(map.get(key) > nums.length/2){
	        		return key;
	        	}
	        }
	        return 0;
	 }
}
