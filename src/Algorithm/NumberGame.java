package Algorithm;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n,b;
		while(scanner.hasNext()) {
			n = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(numberGame(n, b));
		}
	}
	
	public static int numberGame(int n,int b){
		if(b<=n/2) {
			return 2*b;
		} else {
			return (n-b)+1;
		}
	}
}
