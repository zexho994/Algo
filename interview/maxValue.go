package interview

// mv[r][c] = max(mv[r+1][c],mv[r][c+1]) + 
func maxValue(grid [][]int) int {
	if grid == nil || len(grid) < 1 {
		return 0
	}
	row,col := len(grid),len(grid[0])
	memo := make([][]int,row)
	getMax := func(n1,n2 int)int{
		if n1 > n2 {return n1}
		return n2
	} 
	memo[0] = make([]int,col)
	memo[0][0] = grid[0][0]
	for i := 1; i < col; i++{
		memo[0][i] = memo[0][i-1] + grid[0][i]
	}
	for i := 1; i < row; i++{
		memo[i] = make([]int,col)
		memo[i][0] = memo[i-1][0] + grid[i][0]
	}
	for i := 1; i < row; i++{
		for j := 1; j < col; j++{
			memo[i][j] = getMax(memo[i-1][j],memo[i][j-1]) + grid[i][j]
		}
	}
	return memo[row-1][col-1]
}