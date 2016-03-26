import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class SingleNumberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[] {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8}));
	}
	
	public static  int singleNumber(int[] nums) {
        int length = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i : nums){
        	if(map.containsKey(i)) {
        		int temp = map.get(i);
        		temp++;
        		map.put(i, temp);
        		//System.out.println("key = " + i + ", value = " + map.get(i));
        	} else {
        		map.put(i, 1);
        		//System.out.println("key = " + i + ", value = " + map.get(i));
        	}
        }
        Iterator it = map.entrySet().iterator();
       // System.out.println("===================================================================");
        while(it.hasNext()){
        	Map.Entry<Integer, Integer> entry = (Entry<Integer, Integer>) it.next();
        	//System.out.println("key = " + entry.getKey() + ", value = " + entry.getValue());
        	if(entry.getValue() == 1) {
        		return entry.getKey();
        	}
        }
        return -1;
    }
}
