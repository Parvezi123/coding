package Array;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = new int[] {15000, 9000, 7500, 23000, 26500, 7387, 9600};

        int left = 0;
        int right = 1;
        int buy = prices[left];
        int sell = prices[right];
        int profit = 0;
        int n = prices.length;

        while (right < n-1) {

            if (prices[left] < prices[right]) {

                if (profit < (prices[right] - prices[left])) {
                    profit = prices[right] - prices[left];
                    buy = prices[left];
                    sell = prices[right];
                }
                right+=1;
            }
            else {
                left+=1;
                right+=1;
            }
        }
        System.out.println("Buy: " + buy + " Sell: " + sell + " Profit: " + profit);
    }
}
