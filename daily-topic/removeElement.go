package daily_topic

// 2,3,4,5,2,3,4,2,2,2,4 , 2
// 3,4,5,3,4,4
func removeElement(nums []int, val int) int {
	l := len(nums)
	pre, last := 0, 0
	for last < l {
		for last < l && nums[last] == val {
			last++
		}
		if last < l {
			nums[pre] = nums[last]
			pre++
			last++
		}
	}
	nums = nums[:pre]
	return len(nums)
}
