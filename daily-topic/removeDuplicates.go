package daily_topic

func removeDuplicates(nums []int) int {
	i, j := 0, 0
	for j < len(nums) {
		nums[i] = nums[j]
		j++
		for j < len(nums) && nums[i] == nums[j] {
			j++
		}
		i++
	}
	nums = nums[:i]
	return i
}
