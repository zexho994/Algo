package medium

// 面试题 17.18. 最短超串
func shortestSeq(big []int, small []int) []int {
	smallMap := make(map[int]int, len(small))
	for _, n := range small {
		smallMap[n]++
	}
	left, meet, requrieNum := 0, 0, len(small)
	ansL, ansR := 0, len(big)
	for i, n := range big {
		if smallMap[n] == 0 {
			continue
		}
		if smallMap[n] == 1 {
			meet++
		}
		smallMap[n]++
		for meet == requrieNum {
			r := smallMap[big[left]]
			if r == 2 {
				if i-left < ansR-ansL {
					ansR = i
					ansL = left
				}
				break
			} else {
				if r > 2 {
					smallMap[big[left]]--
				}
				left++
			}
		}
	}
	if ansR-ansL == len(big) {
		return []int{}
	}
	return []int{ansL, ansR}
}
