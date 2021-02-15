package easy

func findMaxConsecutiveOnes(nums []int) int {
	maxLen, left := 0, 0
	for i, n := range nums {
		if n != 1 {
			left = i + 1
			continue
		}
		if l := i - left; l > maxLen {
			maxLen = l
		}
	}
	return maxLen + 1
}
