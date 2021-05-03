package daily_topic

func leastBricks(wall [][]int) int {
	memo := make(map[int]int)
	for _, row := range wall {
		c := 0
		for _, col := range row[:len(row)-1] {
			c += col
			memo[c]++
		}
	}

	max := 0
	for _, v := range memo {
		if v > max {
			max = v
		}
	}
	return len(wall) - max
}
