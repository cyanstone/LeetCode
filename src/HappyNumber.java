import java.util.ArrayList;
import java.util.Scanner;


public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new HappyNumber().isHappy(new Scanner(System.in).nextInt()));
	}
	
	public boolean isHappy(int n) {
		ArrayList<Integer> sums = new ArrayList<Integer>();
		int sum = DigitsSquares(n);
		while(!sums.contains(sum)) {
			if(sum == 1) 
				return true;
			sums.add(sum);
			sum = DigitsSquares(sum);
		}
		return false;
	}
	
	private int DigitsSquares(int n) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		while(n != 0) {
			nums.add(n % 10);
			n /= 10;
		}
		int sum = 0;
		for(int c : nums){
			sum += Math.pow(c, 2);
		}
		return sum;
	}
}
