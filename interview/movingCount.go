package interview

func movingCount(m int, n int, k int) int {
	memo := make([][]int, m)
	for r := range memo {
		memo[r] = make([]int, n)
	}
	getN := func(i, j int) int {
		t := 0
		for i > 0 {
			t += i % 10
			i /= 10
		}
		for j > 0 {
			t += j % 10
			j /= 10
		}
		return t
	}
	var loop func(i, j int) int
	loop = func(i, j int) int {
		if i >= m || j >= n || i < 0 || j < 0 {
			return 0
		}
		if memo[i][j] > 0 {
			return 0
		}
		memo[i][j] = 1
		if getN(i, j) > k {
			return 0
		}
		return loop(i+1, j) + loop(i-1, j) + loop(i, j+1) + loop(i, j-1) + 1
	}
	return loop(0, 0)
}
