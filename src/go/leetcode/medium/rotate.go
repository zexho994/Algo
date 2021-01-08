package medium

// array copy
func rotate(nums []int, k int) {
	l := len(nums)
	newArr := make([]int, l)
	for idx := range nums {
		newArr[(k+idx)%l] = nums[idx]
	}
	copy(nums, newArr)
}

// array flip
func rotate1(nums []int, k int) {
	reverse := func(arr []int) {
		for idx, l := 0, len(arr); idx < l/2; idx++ {
			arr[idx], arr[l-idx-1] = arr[l-idx-1], arr[idx]
		}
	}
	k = k % len(nums)
	reverse(nums)
	reverse(nums[:k])
	reverse(nums[k:])
}
