package recall

func combine(n, k int) [][]int {
	var ans [][]int
	if n < 1 || k < 1 {
		return ans
	}
	var res []int
	var f func(idx int)
	f = func(idx int) {
		if k == 0 {
			ans = append(ans, append([]int{}, res...))
			return
		}
		for i := idx; i <= n; i++ {
			res = append(res, i)
			k--
			f(i + 1)
			k++
			res = res[:len(res)-1]
		}
	}
	f(1)
	return ans
}
