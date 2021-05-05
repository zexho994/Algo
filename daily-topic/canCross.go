package daily_topic

func canCross(stones []int) bool {
	for i := 1; i < len(stones); i++ {
		if stones[i]-stones[i-1] > i {
			return false
		}
	}
	var memo [][]bool
	memo = append(memo, make([]bool, len(stones)))
	memo[0][1] = true
	for i := 1; i < len(stones); i++ {
		memo = append(memo, make([]bool, len(stones)))
		for j := i - 1; j >= 0; j-- {
			diff := stones[i] - stones[j]
			if diff > j+1 {
				break
			}
			memo[i][diff] = memo[j][diff] || memo[j][diff-1] || memo[j][diff+1]
			if i == len(stones)-1 && memo[i][diff] {
				return true
			}
		}
	}
	return false
}
