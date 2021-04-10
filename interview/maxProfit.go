package interview

import "math"

func maxProfit(prices []int) int {
	if prices == nil {
		return 0
	}
	profit := 0
	for i := 1; i < len(prices); i++ {
		if prices[i] > prices[i-1] {
			profit += prices[i] - prices[i-1]
		}
	}
	return profit
}

func maxProfit2(prices []int) int {
	memo := make([][][]int, len(prices))
	for i := range memo {
		memo[i] = make([][]int, 2)
		for j := range memo[i] {
			memo[i][j] = make([]int, 3)
		}
	}
	getMax := func(n1, n2 int) int {
		if n1 > n2 {
			return n1
		}
		return n2
	}
	day := len(prices)
	memo[0][1][1] = -prices[0]
	memo[0][0][1] = math.MinInt32
	memo[0][0][2] = math.MinInt32
	memo[0][1][0] = math.MinInt32
	memo[0][1][2] = math.MinInt32
	for i := 1; i < day; i++ {
		// 买过一次，卖了
		memo[i][0][1] = getMax(memo[i-1][0][1], memo[i-1][1][1]+prices[i])
		// 买过一次，还没卖
		memo[i][1][1] = getMax(memo[i-1][1][1], memo[i-1][0][0]-prices[i])
		// 买过2次，卖了
		memo[i][0][2] = getMax(memo[i-1][0][2], memo[i-1][1][2]+prices[i])
		// 买过两次，还没卖
		memo[i][1][2] = getMax(memo[i-1][1][2], memo[i-1][0][1]-prices[i])
	}
	max := getMax(memo[day-1][0][0], memo[day-1][0][1])
	return getMax(max, memo[day-1][0][2])
}
