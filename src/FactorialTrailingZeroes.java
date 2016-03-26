import java.util.Scanner;


public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new FactorialTrailingZeroes()
		.trailingZeroes(new Scanner(System.in).nextInt()));
	}
	
	public int trailingZeroes(int n) {
		if(n < 0) return 0;
        int sum = 0;
        while(n != 0) {
        	sum += n/5;
        	n /= 5;
        }
        return sum;
    }
}
