package interview

func fib(n int) int {
	memo := make(map[int]int, n)
	memo[0], memo[1] = 0, 1
	var f func(n int) int
	f = func(n int) int {
		if n < 0 {
			return 0
		}
		if memo[n] != 0 {
			return memo[n]
		}
		memo[n] = (f(n-1) + f(n-2)) % 1000000007
		return memo[n]
	}
	return f(n)
}
