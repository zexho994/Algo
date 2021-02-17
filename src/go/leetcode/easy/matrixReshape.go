package easy

func matrixReshape(nums [][]int, r int, c int) [][]int {
	if len(nums)*len(nums[0]) != r*c {
		return nums
	}
	col, row := 0, 0
	ansArr := make([][]int, r)
	ansArr[0] = make([]int, c)
	for _, rl := range nums {
		for _, cl := range rl {
			ansArr[row][col] = cl
			if col == c-1 {
				col = 0
				row++
				if row < r {
					ansArr[row] = make([]int, c)
				}
			} else {
				col++
			}
		}
	}
	return ansArr
}
