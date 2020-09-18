class Stonks {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1)
            return 0;
        int first = prices[0];
        int result = 0;
        for(int i = 1; i<prices.length; i++) {
            if(prices[i]> first){
                if(result < prices[i] - first)
                    result = prices[i] - first;
            } else
                first = prices[i];
        }
        return result;
    }
}