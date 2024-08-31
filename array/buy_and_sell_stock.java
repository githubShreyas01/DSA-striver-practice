class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int prof = 0;
        int cost = 0;

        for(int i =1; i<n;i++){
            cost = prices[i] - mini;
            prof = Math.max(prof, cost);
            mini = Math.min(mini, prices[i]);
        }

        return prof;
    }
}
