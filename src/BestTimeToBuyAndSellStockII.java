import java.util.Scanner;

public class BestTimeToBuyAndSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int [] prices = new int[n];
		for(int i = 0; i < n; i++) {
			prices[i] = scanner.nextInt();
		}
		
		System.out.println(maxProfit(prices));
	}
	
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		for(int i = 1; i < prices.length; i++) {
			if(prices[i] > prices[i - 1]) {
				maxProfit += prices[i] - prices[i - 1];
			}
		}
		return maxProfit;
	}

}
