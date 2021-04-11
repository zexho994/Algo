package interview

// ml(i) = ml(j) + 1
// j < i && nums[j] < nums[i] && nums[j]为最长的情况
func lengthOfLIS(nums []int) int {
	memo := make([]int, len(nums))
	memo[0] = 1
	for i := 1; i < len(nums); i++ {
		max := 0
		for j := 0; j < i; j++ {
			if nums[i] > nums[j] && memo[j] > max {
				max = memo[j]
			}
		}
		memo[i] = max + 1
	}
	return memo[len(nums)-1]
}
