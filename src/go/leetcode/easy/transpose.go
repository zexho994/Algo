package easy

func transpose(matrix [][]int) [][]int {
	ans := make([][]int, len(matrix[0]))
	for i := 0; i < len(matrix[0]); i++ {
		ans[i] = make([]int, len(matrix))
		for j := 0; j < len(matrix); j++ {
			ans[i][j] = matrix[j][i]
		}
	}
	return ans
}
