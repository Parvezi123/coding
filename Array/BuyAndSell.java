package Array;

public class BuyAndSell {
    public static void main(String[] args) {
        int[] prices = new int[] {15000, 9000, 7500, 23000, 26500, 7387, 9600};

        int maxProfit = buyAndSell(prices);
        System.out.println("Max Profit: " + maxProfit);
    }

    static int buyAndSell (int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int left = 0;
        int right = 1;
        int profit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                    int newProfit = prices[right] - prices[left];
                    if (profit < newProfit) {
                        profit = newProfit;
                    }
                    right++;
            }
            else {
                left = right;
                right++;
            }
        }
        return profit;
    }
}
