package daily_topic

func numWays(steps int, arrLen int) int {
	minLen := arrLen
	if arrLen > steps+1 {
		minLen = steps + 1
	}
	memo := make([]int, minLen)
	memo[0] = 1
	for i := 0; i < steps; i++ {
		next := make([]int, minLen)
		for j := 0; j < minLen; j++ {
			r1, r2 := 0, 0
			if j-1 >= 0 {
				r1 = memo[j-1]
			}
			if j+1 < minLen {
				r2 = memo[j+1]
			}
			next[j] = (memo[j] + r1 + r2) % 1000000007
		}
		memo = next
	}
	return memo[0]
}
