/**
 * @author Zexho
 * @date 2022/3/26 8:49 PM
 */
public class MaxProfit {

    public int maxProfit(int[] prices) {
        int min = prices[0], max = 0, pro;
        for (int i = 1; i < prices.length; i++) {
            max = (pro = prices[i] - min) > max ? pro : max;
            min = Math.min(min, prices[i]);
        }
        return max;
    }

}
