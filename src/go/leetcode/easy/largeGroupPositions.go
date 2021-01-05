package easy

func largeGroupPositions(s string) [][]int {
	var ans = [][]int{}
	start := 0
	for idx := range s {
		if s[idx] == s[start] {
		} else {
			if idx-start >= 3 {
				ans = append(ans, []int{start, idx - 1})
			}
			start = idx
		}
	}
	if len(s)-start >= 3 {
		ans = append(ans, []int{start, len(s) - 1})
	}
	return ans
}
