import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new PascalsTriangle().generate(new Scanner(System.in).nextInt()));
	}
	
	public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
       if(numRows <= 0)
    	   return result;
       List<Integer> pre = new ArrayList<Integer>();
       pre.add(1);
       result.add(pre);
       for(int i = 1; i < numRows; i++){
    	   List<Integer> cur = new ArrayList<Integer>();
    	   cur.add(1);
    	   for(int j = 0; j < pre.size() - 1; j++){
    		   cur.add(pre.get(j) + pre.get(j + 1));
    	   }
    	   cur.add(1);
    	   result.add(cur);
    	   pre = cur;
       }
       return result;
    }
}
