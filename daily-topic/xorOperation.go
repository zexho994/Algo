package daily_topic

func xorOperation(n int, start int) int {
	ans := 0
	for i := 0; i < n; i++ {
		ans ^= 2*i + start
	}
	return ans
}
