package array

func generateMatrix(n int) [][]int {
	v := 1
	sum := n * n
	top, left := 0, 0
	down, right := n-1, n-1
	ans := make([][]int, n)
	for idx := range ans {
		ans[idx] = make([]int, n)
	}
	for v <= sum {
		for i := left; i <= right && v <= sum; i++ {
			ans[top][i] = v
			v++
		}
		top++

		for i := top; i <= down && v <= sum; i++ {
			ans[i][right] = v
			v++
		}
		right--

		for i := right; i >= left && v <= sum; i-- {
			ans[down][i] = v
			v++
		}
		down--

		for i := down; i >= top && v <= sum; i-- {
			ans[i][left] = v
			v++
		}
		left++
	}
	return ans
}
