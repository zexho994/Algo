package daily_topic

func nthUglyNumber(n int) int {
	memo := make([]int, n+1)
	memo[1] = 1
	Min := func(n1, n2 int) int {
		if n1 < n2 {
			return n1
		}
		return n2
	}
	p2, p3, p5 := 1, 1, 1
	for i := 2; i <= n; i++ {
		n2, n3, n5 := memo[p2]*2, memo[p3]*3, memo[p5]*5
		memo[i] = Min(Min(n2, n3), n5)
		if memo[i] == n2 {
			p2++
		}
		if memo[i] == n3 {
			p3++
		}
		if memo[i] == n5 {
			p5++
		}
	}
	return memo[len(memo)-1]
}
