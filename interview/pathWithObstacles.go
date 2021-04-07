package interview

func pathWithObstacles(obstacleGrid [][]int) [][]int {
	row, col := len(obstacleGrid), len(obstacleGrid[0])
	var ans [][]int
	var arr [][]int
	dp := func(r, c int, arr [][]int) {}
	dp = func(r, c int, arr [][]int) {
		if ans != nil || r == row || c == col || obstacleGrid[r][c] == 1 {
			return
		}
		arr = append(arr, []int{r, c})
		if r == row-1 && c == col-1 {
			ans = arr
			return
		}
		obstacleGrid[r][c] = 1
		dp(r, c+1, arr)
		if ans != nil {
			return
		}
		dp(r+1, c, arr)
	}
	dp(0, 0, arr)
	return ans
}
