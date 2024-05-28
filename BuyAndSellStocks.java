package apna_college;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + getMaxProfit(prices));
    }
    static int getMaxProfit(int prices[]){
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            profit = Math.max(profit, prices[i] - buyPrice);
            if(prices[i] < buyPrice)
                buyPrice = prices[i];
        }
        return profit;
    }
}
