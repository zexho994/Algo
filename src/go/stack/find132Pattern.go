package stack

import "math"

func find132pattern(nums []int) bool {
	l := len(nums)
	if l <= 2 {
		return false
	}
	var mid []int
	right := math.MinInt32
	for i := l - 1; i >= 0; i-- {
		if nums[i] < right  {
			return true
		}
		for len(mid) != 0 && mid[len(mid)-1] <nums[i] {
			right = mid[len(mid)-1]
			mid = mid[:len(mid)-1] 
		}
		mid = append(mid, nums[i]) 
	}
	return false
}