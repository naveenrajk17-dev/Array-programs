package Arrays_Program;
/*
Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0. */
public class Best_Time_to_Buy_and_Sell {
    public static int maxProfit(int[] prices) {
        int maxProfit=0;
        int buy=prices[0];

        for(int i=1;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-buy);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
    }
}
