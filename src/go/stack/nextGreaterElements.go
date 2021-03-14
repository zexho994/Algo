package stack

// 503. 下一个更大元素 II
func nextGreaterElements(nums []int) []int {
	var stack []int
	l := len(nums)
	res := make([]int, len(nums))
	nums = append(nums, nums...)
	count := 0
	for i := range res {
		res[i] = -1
	}
	for i := 0; i < len(nums) && count < l; i++ {
		for stack != nil && len(stack) > 0 && nums[i] > nums[stack[len(stack)-1]] {
			count++
			res[stack[len(stack)-1]%l] = nums[i]
			stack = stack[:len(stack)-1]
		}
		if i >= l {
			continue
		}
		stack = append(stack, i)
	}
	return res
}
