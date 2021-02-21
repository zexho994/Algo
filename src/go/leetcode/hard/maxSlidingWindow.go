package hard

// 滑动窗口 + 单调队列
// 新加入的数如果比队尾的数大，那么弹出队尾的数，重复此步骤直到队列为空或者小于队尾的数
func maxSlidingWindow(nums []int, k int) []int {
	var ansArr, decQueue []int
	left := 0
	push := func(n int) {
		for len(decQueue) > 0 &&
			n > decQueue[len(decQueue)-1] {
			decQueue = decQueue[:len(decQueue)-1]
		}
		decQueue = append(decQueue, n)
	}
	// 构建单调队列
	for i := 0; i < k-1; i++ {
		push(nums[i])
	}
	// 统计结果
	for i := k - 1; i < len(nums); i++ {
		push(nums[i])
		ansArr = append(ansArr, decQueue[0])
		if nums[left] == decQueue[0] {
			decQueue = decQueue[1:]
		}
		left++
	}
	return ansArr
}
