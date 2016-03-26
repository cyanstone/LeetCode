import java.util.Arrays;


public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int []{9,9,9};
		System.out.println(Arrays.toString( new PlusOne().plusOne(digits)));
	}
	
	public int[] plusOne(int[] digits) {
		int digitsSize = digits.length;
       digits[digitsSize - 1]++;
       for(int i = digitsSize - 1; i > 0; i--){
    	   if(digits[i] > 9) {
    		   digits[i] -= 10;
    		   digits[i - 1]++;
    	   }
       }
       if(digits[0] < 10) {
    	   return digits;
       }else{
    	  int [] nDigits = new int[digitsSize + 1];
    	  nDigits[0] = 1;
    	  nDigits[1] = digits[0] - 10;
    	  for(int i = 1; i < digitsSize; i++){
    		  nDigits[i + 1] = digits[i];
    	  }
    	  return nDigits;
       }
    }
}
