package interview

func maxSlidingWindow(nums []int, k int) []int {
	var ans []int
	var stack []int
	for i := 0; i < k-1; i++ {
		for len(stack) > 0 && nums[i] > stack[len(stack)-1] {
			stack = stack[:len(stack)-1]
		}
		stack = append(stack, nums[i])
	}

	for i := k - 1; i <= len(nums)-k; i++ {
		for len(stack) > 0 && nums[i] > stack[len(stack)-1] {
			stack = stack[:len(stack)-1]
		}
		stack = append(stack, nums[i])
		ans = append(ans, stack[0])
		if stack[0] == nums[i] {
			stack = stack[1:]
		}
	}

	return ans
}
