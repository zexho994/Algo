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

func maxProfit3(prices []int) int {
	day := len(prices)
	memo := make([][]int, day)
	for i := range memo {
		memo[i] = make([]int, 2)
	}
	getMax := func(n1, n2 int) int {
		if n1 > n2 {
			return n1
		}
		return n2
	}
	memo[0][1] = prices[0]
	for i := 1; i < day; i++ {
		memo[i][0] = getMax(memo[i-1][0], memo[i-1][1]+prices[i])
		if i == 1 {
			memo[i][1] = getMax(memo[i-1][0]-prices[i], memo[i-1][1])
		} else {
			memo[i][1] = getMax(memo[i-2][1], memo[i-2][0]-prices[i])
		}
	}
	return memo[day-1][0]
}

// 188. 买卖股票的最佳时机 IV
// 					Mp[day-1][j][k]                   // 今天不操作
// Mp[day][j][k] =  Mp[day-1][j-1][k-1] - prices[day] // 今天抄底
//                  Mp[day-1][j+1][k]   + prices[day] // 今天减仓
func maxProfit4(k int, prices []int) int {
	// 撸棒性
	if k < 1 || prices == nil || len(prices) < 1 {
		return 0
	}

	// 构造备忘录
	l := k + 1
	arr := make([][][]int, len(prices))
	for j := range arr {
		arr[j] = make([][]int, 2)
		for k := range arr[j] {
			arr[j][k] = make([]int, l)
		}
	}

	// 获取较大值函数
	getMax := func(n1, n2 int) int {
		if n1 > n2 {
			return n1
		}
		return n2
	}

	// 构造初始条件
	arr[0][0][0] = 0
	arr[0][1][1] = -prices[0]
	arr[0][0][1] = math.MinInt32
	arr[0][1][0] = math.MinInt32
	for s := 2; s <= k; s++ {
		arr[0][0][s] = math.MinInt32
		arr[0][1][s] = math.MinInt32
	}

	// dp
	for d := 1; d < len(prices); d++ {
		for s := 0; s <= k; s++ {
			// 没有股票 => 卖了，没操作
			arr[d][0][s] = getMax(arr[d-1][0][s], arr[d-1][1][s]+prices[d])
			if s == 0 {
				arr[d][1][0] = math.MinInt32
			} else {
				// 有股票 => 买了，没操作
				arr[d][1][s] = getMax(arr[d-1][1][s], arr[d-1][0][s-1]-prices[d])
			}
		}
	}

	// 获取最大值
	max := 0
	for _, p := range arr[len(prices)-1][0] {
		max = getMax(max, p)
	}
	return max
}
