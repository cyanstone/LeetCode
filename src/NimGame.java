import java.util.Scanner;


public class NimGame {

	public static boolean canWinNim(int n){
		if(n % 4 == 0){
			return false;
		}else{
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(canWinNim(n));
	}

}
