package medium

// 96. 不同的二叉搜索树
func numTrees(n int) int {
	memo := make(map[int]int)
	memo[0], memo[1], memo[2] = 1, 1, 2
	return dp1(n, memo)
}

func dp1(n int, memo map[int]int) int {
	if memo[n] != 0 {
		return memo[n]
	}
	num := 0
	for i := 1; i <= n; i++ {
		num += dp1(i-1, memo) * dp1(n-i, memo)
	}
	memo[n] = num
	return num
}
