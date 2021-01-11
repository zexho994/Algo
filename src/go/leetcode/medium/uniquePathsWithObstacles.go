package medium

func UniquePathsWithObstacles(grid [][]int) int {
	rl, cl := len(grid), len(grid[0])
	def := 1
	for col := range grid[0] {
		if grid[0][col] == 1 {
			def = 0
		}
		grid[0][col] = def
	}
	def = 1
	for row := 1; row < rl; row++ {
		if grid[row][0] == 1 {
			def = 0
		}
		grid[row][0] = def
	}
	for row := 1; row < rl; row++ {
		for col := 1; col < cl; col++ {
			if grid[row][col] == 1 {
				grid[row][col] = 0
			} else {
				grid[row][col] = grid[row-1][col] + grid[row][col-1]
			}
		}
	}
	return grid[rl-1][cl-1]
}
