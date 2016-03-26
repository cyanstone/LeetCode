
public class BestTimeToBuyAndSellStock {
	public static void main(String[] args) {
		
	}
	
	public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) return 0;
        int minBuyPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0; i < n; i++) {
        	minBuyPrice = Math.min(prices[i], minBuyPrice);
        	maxProfit = Math.max(maxProfit,prices[i] - minBuyPrice);
        }
        return maxProfit;
    }
}
