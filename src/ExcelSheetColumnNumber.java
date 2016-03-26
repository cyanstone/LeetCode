import java.util.Scanner;


public class ExcelSheetColumnNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(new ExcelSheetColumnNumber().titleToNumber(s));
	}
	
	 public int titleToNumber(String s) {
	      int sum = 0;
	      int tmp = 0;
	      for(int i = 0; i < s.length(); i++){
	    	  tmp = s.charAt(i) -'A' + 1;
	    	  sum = sum *26 + tmp;
	      }
	      return sum;
	 }
}
