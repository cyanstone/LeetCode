import java.util.ArrayList;
import java.util.Scanner;


public class AddDigits {
	
	public int addDigits(int num){
		int result = 0;
		do	{
			ArrayList<Integer> nums = new ArrayList<Integer>();
			while(num != 0){
				int i = num % 10;
				nums.add(i);
				num /= 10;
			}
			result = addNum(nums);
			num = result;
		}while(result >= 10);
			return result;
	}
	
	public static int  addNum(ArrayList<Integer> a){
		int result = 0;
		for(int i : a){
			result += i;
		}
		return result;
	}
	public static void main(String[] args){
		AddDigits add = new AddDigits();
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(add.addDigits(n));
	}
}
