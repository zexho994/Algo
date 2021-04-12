package interview

// f([r][c]) = min(f([r+1][c]),f([r+1][c+1])) + c
// https://leetcode-cn.com/problems/triangle/
func minimumTotal(triangle [][]int) int {
	memo := make([][]int, len(triangle))
	f := func(r, c int) int { return 0 }
	f = func(r, c int) int {
		if memo[r] != nil {
			if n := memo[r][c]; n != 0 {
				return n
			}
		} else {
			memo[r] = make([]int, r+1)
		}
		if r == len(triangle)-1 {
			return triangle[r][c]
		}
		memo[r][c] = f(r+1, c)
		n2 := f(r+1, c+1)
		if memo[r][c] < n2 {
			memo[r][c] += triangle[r][c]
			return memo[r][c]
		}
		memo[r][c] = n2 + triangle[r][c]
		return memo[r][c]
	}
	return f(0, 0)
}
