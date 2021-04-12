package interview

func maxSubArray(nums []int) int {
	if nums == nil || len(nums) < 1 {
		return 0
	}
	max, idx, sum := nums[0], 0, 0
	l := len(nums)
	dp := func() int { return 0 }
	dp = func() int {
		if idx == l {
			return max
		}
		sum += nums[idx]
		if sum < 0 {
			sum = 0
		} else if sum > max {
			max = sum
		}
		idx++
		return dp()
	}
	return dp()
}
