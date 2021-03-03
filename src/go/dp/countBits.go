package dp

func countBits(num int) []int {
	ans, s, n := make([]int, num+1), 0, 1
	ans[0] = 0
	for idx := 1; idx <= num; idx++ {
		if idx == n {
			ans[idx] = 1
			s = n
			n *= 2
			continue
		}
		ans[idx] = ans[s] + ans[idx-s]
	}
	return ans
}
