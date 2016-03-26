import java.util.Arrays;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//DCXXI 621
		System.out.println(romanToInt(new Scanner(System.in).nextLine()));
	}
	
	public  static int romanToInt(String s) {
		char[] roman = s.toCharArray();
		int [] nums = new int[roman.length];
		for(int i = 0; i < roman.length; i++) {
			switch(roman[i]) {
			case 'I' :
				nums[i] = 1;
				break;
			case 'V' :
				nums[i] = 5;
				break;	
			case 'X' :
				nums[i] = 10;
				break;	
			case 'L' :
				nums[i] = 50;
				break;	
			case 'C' :
				nums[i] = 100;
				break;	
			case 'D' :
				nums[i] = 500;
				break;	
			case 'M' :
				nums[i] = 1000;
				break;	
			default:
				break;	
			}
		}
		System.out.println(Arrays.toString(nums));
		int result = nums[0];
		for(int i = 1; i < nums.length; i++){
			if(nums[i] <= nums[i-1]){
				result += nums[i];
			} else {
				result += nums[i] - 2 * nums[i-1];
			}
		}
		return result;
	}
}
