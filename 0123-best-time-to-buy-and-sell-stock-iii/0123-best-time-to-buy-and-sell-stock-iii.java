class Solution {
    public int maxProfit(int[] prices) {
        // int maxProfit=0;
        // int p=0;
        // for(int i=1;i<prices.length;i++){
        // if(prices[i]>prices[i-1]){
        // int profit=prices[i]-prices[i-1];
        // maxProfit=Math.max(profit,maxProfit);
        // }

        // p+=maxProfit;
        // }
        // return p;
        if (prices.length == 0)
            return 0;
        int firstBuy = Integer.MIN_VALUE;
        int secondBuy = Integer.MIN_VALUE;
        int firstSale = 0;
        int secondSale = 0;
        for (int i = 0; i < prices.length; i++) {
            firstBuy = Math.max(firstBuy, -prices[i]);
            firstSale = Math.max(firstSale, firstBuy + prices[i]);
            secondBuy = Math.max(secondBuy, firstSale - prices[i]);
            secondSale = Math.max(secondSale, secondBuy + prices[i]);
        }
        return secondSale;

    }
}