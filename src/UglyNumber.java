import java.util.Scanner;


public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new UglyNumber().isUgly(new Scanner(System.in).nextInt()));
	}
	
	public boolean isUgly(int num) {
       if(num < 0) return false;
       if(num == 1) return true;
       while(num >= 2 && num % 2 == 0) num /= 2;
       while(num >= 3 && num % 3 == 0) num /= 3;
       while(num >= 5 && num % 5 == 0) num /= 5;
       return num == 1;
    }
}
