package interview

func numWays(n int) int {
	if n == 0 || n == 1 {
		return 1
	}
	if n == 2 {
		return 2
	}
	memo := make([]int, n+1)
	memo[0], memo[1], memo[2] = 1, 1, 2
	return dp(n, &memo)
}

func dp(n int, memo *[]int) int {
	if (*memo)[n] != 0 {
		return (*memo)[n]
	}
	res := (dp(n-1, memo) + dp(n-2, memo)) % 1000000007
	(*memo)[n] = res
	return res
}
