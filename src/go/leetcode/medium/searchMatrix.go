package medium

func searchMatrix(matrix [][]int, target int) bool {
	// 寻找行
	row := 0
	for row+1 < len(matrix) && matrix[row+1][0] <= target {
		row++
	}

	// 寻找列
	col := 0
	for col < len(matrix[0]) && matrix[row][col] <= target {
		if matrix[row][col] == target {
			return true
		}
		col++
	}
	return false
}
