package Algorithm;
import java.util.Scanner;


public class FontSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int i = 0; i < n; i++) {
			int N = scanner.nextInt();
			int  P = scanner.nextInt();
			int W = scanner.nextInt();
			int H = scanner.nextInt();
			int array[] = new int[N];
			for(int j = 0; j < N; j++) {
				array[j] = scanner.nextInt();
			}
			System.out.println(maxFontSize(N, P, W, H, array));
		}
	}
	
	public static int maxFontSize(int N, int P, int W,int H,int[]array) {
		
		Double lastAnswer = Double.MIN_VALUE;
		for(int s = 1; s < Integer.MAX_VALUE; s++) {
			double rowCharacter =  Math.floor(W/s);
			int totalLine = 0;
			for(int j = 0; j < N; j++){
				totalLine += Math.ceil(Math.ceil(array[j]/rowCharacter));
			}
			double pages = Math.ceil(totalLine/Math.floor(H/s));
			if(lastAnswer <= P && pages > P) return s - 1;
			lastAnswer = pages;
	}
		return Integer.MIN_VALUE;
	}
}
