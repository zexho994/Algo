package easy

func sortedSquares(arr []int) []int {
	left, right := 0, len(arr)-1
	res := make([]int, len(arr))
	for idx := len(arr) - 1; idx >= 0; idx-- {
		if -arr[left] > arr[right] {
			res[idx] = arr[left] * arr[left]
			left++
		} else {
			res[idx] = arr[right] * arr[right]
			right--
		}
	}
	return res
}
