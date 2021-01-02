package hard

// 单调队列
// 新加入的数如果比队尾的数大，那么弹出队尾的数，重复此步骤直到队列为空或者小于队尾的数
func maxSlidingWindow(nums []int, k int) []int {
	var queue, ans []int
	length := len(nums)
	push := func(i int) {
		// 新加入的数替换更老且小的数
		for len(queue) != 0 && nums[queue[len(queue)-1]] <= nums[i] {
			queue = queue[:len(queue)-1]
		}
		queue = append(queue, i)
	}
	for i := 0; i < k; i++ {
		push(i)
	}
	ans = append(ans, nums[queue[0]])
	for i := k; i < length; i++ {
		for len(queue) > 0 && queue[0] < i-k+1 {
			queue = queue[1:]
		}
		push(i)
		ans = append(ans, nums[queue[0]])
	}
	return ans
}
