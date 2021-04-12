package array

// 54. 螺旋矩阵
func spiralOrder(matrix [][]int) []int {
	left, top := 0, 0
	right := len(matrix[0])
	down := len(matrix)
	var num = right * down
	right--
	down--
	var ans []int
	for num > 0 {
		for i := left; i <= right && num > 0; i++ {
			ans = append(ans, matrix[top][i])
			num--
		}
		top++
		for i := top; i <= down && num > 0; i++ {
			ans = append(ans, matrix[i][right])
			num--
		}
		right--
		for i := right; i >= left && num > 0; i-- {
			ans = append(ans, matrix[down][i])
			num--
		}
		down--
		for i := down; i >= top && num > 0; i-- {
			ans = append(ans, matrix[i][left])
			num--
		}
		left++
	}
	return ans
}
