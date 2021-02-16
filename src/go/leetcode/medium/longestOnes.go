package medium

func longestOnes(A []int, K int) int {
	maxLen, left, changeSize := 0, 0, 0
	for i, n := range A {
		if n == 0 {
			if changeSize < K {
				changeSize++
			} else {
				for A[left] == 0 {
					left++
				}
				left++
				continue
			}
		}
		if l := i - left; l > maxLen {
			maxLen = l
		}
	}
	return maxLen + 1
}
