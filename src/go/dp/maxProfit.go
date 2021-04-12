package dp

import "math"

// 121. 买卖股票的最佳时机
// 永远用当前点与当前点之前的最低点进行比较就可以得出最大的利润了
func maxProfit(prices []int) int {
	maxProfit := 0
	minPrices := math.MaxInt32
	for i := 0; i < len(prices); i++ {
		if minPrices > prices[i] {
			minPrices = prices[i]
		} else if prices[i]-minPrices > maxProfit {
			maxProfit = prices[i] - minPrices
		}
	}
	return maxProfit
}
