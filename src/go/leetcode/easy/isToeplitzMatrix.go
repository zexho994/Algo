package easy

func isToeplitzMatrix(matrix [][]int) bool {
	r, c := len(matrix), len(matrix[0])
	for row := 0; row < r-1; row++ {
		for col := 0; col < c-1; col++ {
			if matrix[row][col] != matrix[row+1][col+1] {
				return false
			}
		}
	}
	return true
}
