package interview

func exist(board [][]byte, word string) bool {
	if board == nil {
		return false
	}
	if word == "" {
		return true
	}
	memo := make([][]bool, len(board))
	for i := range memo {
		memo[i] = make([]bool, len(board[0]))
	}
	var dfs func(r, c, i int) bool
	dfs = func(r, c, i int) bool {
		if i == len(word) {
			return true
		}
		flag := false
		memo[r][c] = true
		if r+1 < len(board) && !memo[r+1][c] && board[r+1][c] == word[i] {
			flag = dfs(r+1, c, i+1)
		}
		if r > 0 && !memo[r-1][c] && board[r-1][c] == word[i] && !flag {
			flag = dfs(r-1, c, i+1)
		}
		if c+1 < len(board[0]) && !memo[r][c+1] && board[r][c+1] == word[i] && !flag {
			flag = dfs(r, c+1, i+1)
		}
		if c > 0 && !memo[r][c-1] && board[r][c-1] == word[i] && !flag {
			flag = dfs(r, c-1, i+1)
		}
		memo[r][c] = false
		return flag
	}
	for row, ra := range board {
		for col, ca := range ra {
			if ca == word[0] {
				if dfs(row, col, 1) {
					return true
				}
			}
		}
	}
	return false
}

func T(s string, b byte) bool {
	if s[0] == b {
		return true
	}
	return false
}
