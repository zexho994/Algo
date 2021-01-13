package easy

func maximumWealth(accounts [][]int) int {
	maxVal := 0
	for _, n := range accounts {
		curVal := 0
		for _, v := range n {
			curVal += v
		}
		if maxVal < curVal {
			maxVal = curVal
		}
	}

	return maxVal
}
