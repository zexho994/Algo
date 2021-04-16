package sort

func quickSort(arr []int) {
	core(0, len(arr)-1, arr)
}

func core(left, right int, arr []int) {
	if left >= right {
		return
	}
	p := partSort(left, right, arr)
	core(left, p-1, arr)
	core(p+1, right, arr)
}

func partSort(left, right int, arr []int) int {
	p := right - 1
	for left <= p {
		if arr[left] < arr[right] {
			left++
		} else {
			t := arr[p]
			arr[p] = arr[left]
			arr[left] = t
			p--
		}
	}
	t := arr[right]
	arr[right] = arr[left]
	arr[left] = t
	return left
}
