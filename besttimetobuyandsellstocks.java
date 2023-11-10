public class besttimetobuyandsellstocks {
  public int maxProfit1(int[] prices) {
    int min_price = prices[0];
    int maxprof = 0;
    for (int i=1;i < prices.length;i++) {
        maxprof = Math.max(maxprof, prices[i]-min_price);
        min_price = Math.min(prices[i], min_price);
    }

    return maxprof;
}

public int maxProfit2(int[] prices) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    int profitToday = 0;

    for (int i = 0; i < prices.length; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        }
        profitToday = prices[i] - minPrice;
        if (maxProfit < profitToday) {
            maxProfit = profitToday;
        }
    }
    return maxProfit;
}
}
