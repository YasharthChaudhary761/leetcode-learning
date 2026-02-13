class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i])
            {
                min = prices[i];
            }
            int profit=prices[i]-min;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit;

        /**int minPrices=prices[0];
        int maxprofit=0;
        int minprofit=prices[0];
        for(int i=0;i<prices.length;++i){
           if(minprofit>maxprofit){
            maxprofit=minprofit;
           }
           int profit=prices[i]-maxprofit;
            maxprofit=Math.max(maxprofit,profit);
        }
        return maxprofit; **/
    }
}