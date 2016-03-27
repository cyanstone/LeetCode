import java.util.Scanner;

public class BulbSwitcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bulbSwitch(new Scanner(System.in).nextInt()));
	}
	
	public static int bulbSwitch(int n) {
		int result = 0;
		for(int i = 1; i * i <= n; i++,result++);
		return result;
	}

}
