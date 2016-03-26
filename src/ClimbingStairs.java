import java.util.Scanner;


public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new ClimbingStairs().climbStairs(new Scanner(System.in).nextInt()));
	}

	public int climbStairs(int n) {
		if(n == 0 || n == 1) 
			return 1;
		int pre = 1;
        int curr = 1;
        for(int i = 2; i <= n; i++ ) {
        	int temp = pre + curr;
        	pre = curr;
        	curr = temp;
        }
        
        return curr;
    }
}
