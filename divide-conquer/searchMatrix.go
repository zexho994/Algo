package divide_conquer

func searchMatrix(matrix [][]int, target int) bool {
	if matrix == nil {
		return false
	}
	r, c := len(matrix)-1, 0
	for r >= 0 && c >= 0 && r < len(matrix) && c < len(matrix[0]) {
		if matrix[r][c] == target {
			return true
		} else if matrix[r][c] > target {
			r--
		} else {
			c++
		}
	}
	return false
}
