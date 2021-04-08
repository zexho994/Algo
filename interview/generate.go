package interview

func generate(numRows int) [][]int {
	var ans [][]int
	ans = append(ans, []int{1})
	for i := 0; i < numRows-1; i++ {
		var row []int
		row = append(row, ans[i][0])
		for j := 1; j < i+1; j++ {
			row = append(row, ans[i][j]+ans[i][j-1])
		}
		row = append(row, ans[i][i])
		ans = append(ans, row)
	}
	return ans
}
