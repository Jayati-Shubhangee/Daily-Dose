class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        int n = prices.length;
        for (int i = 1; i < n; i++) {
            if (prices[i] < buy) {
                buy = prices[i]; // Found a lower buying price
            } else {
                profit = Math.max(prices[i] - buy, profit); // Check if selling now gives more profit
            }
        }
        return profit; 
    }
}