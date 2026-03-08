class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int sell=1; sell < prices.length;sell++){
            if(prices[sell] > buy)
            profit = Math.max(profit, prices[sell]-buy);
            else
            buy = prices[sell];
        }
        return profit;
    }
}