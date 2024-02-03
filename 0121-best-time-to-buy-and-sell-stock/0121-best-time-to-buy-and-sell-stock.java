class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyStock = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyStock < prices[i]) {
                int profit = prices[i] - buyStock;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyStock = prices[i];
            }
        }
        return maxProfit;
    }
}