package hard

func MaxProfit(prices []int) int {
	buy1, sale1 := -prices[0], 0
	buy2, sale2 := -prices[0], 0
	for idx := range prices {
		buy1 = max(buy1, -prices[idx])
		sale1 = max(sale1, prices[idx]+buy1)
		buy2 = max(buy2, sale1-prices[idx])
		sale2 = max(sale2, buy2+prices[idx])
	}
	return sale2
}

func max(n1, n2 int) int {
	if n1 > n2 {
		return n1
	}
	return n2
}
