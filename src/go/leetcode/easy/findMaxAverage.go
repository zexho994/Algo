package easy

func findMaxAverage(nums []int, k int) float64 {
	max, left, right := 0, 0, k
	for i := 0; i < k; i++ {
		max += nums[i]
	}
	cur := max
	for ; right < len(nums); right++ {
		cur += nums[right]
		cur -= nums[left]
		if cur > max {
			max = cur
		}
		left++
	}
	return float64(max) / float64(k)
}
