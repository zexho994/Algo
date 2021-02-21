package medium

// 1438. 绝对差不超过限制的最长连续子数组
// 滑动窗口，区间里的值始终符合要求
//   单调递增队列，记录区间中的最小值
//   单调递减队列，记录区间中的最大值
func longestSubarray(nums []int, limit int) int {
	var minQ, maxQ []int
	maxLen, left := 0, 0
	for idx, n := range nums {
		for len(minQ) > 0 && n < minQ[len(minQ)-1] {
			minQ = minQ[:len(minQ)-1]
		}
		for len(maxQ) > 0 && n > maxQ[len(maxQ)-1] {
			maxQ = maxQ[:len(maxQ)-1]
		}
		minQ = append(minQ, n)
		maxQ = append(maxQ, n)

		for len(maxQ) > 0 && len(minQ) > 0 && maxQ[0]-minQ[0] > limit {
			if nums[left] == maxQ[0] {
				maxQ = maxQ[1:]
			}
			if nums[left] == minQ[0] {
				minQ = minQ[1:]
			}
			left++
		}

		if idx-left > maxLen {
			maxLen = idx - left
		}
	}
	return maxLen + 1
}
