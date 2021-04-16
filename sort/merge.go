package sort

func mergeSort(nums []int) {
	split(nums, 0, len(nums)-1)
}

// 合并
func split(arr []int, left, right int) {
	if left >= right {
		return
	}
	mid := (right-left)/2 + left
	split(arr, left, mid)
	split(arr, mid+1, right)
	merge(left, mid, right, arr)
}

// 排序j
func merge(left, mid, right int, arr []int) {
	temp := make([]int, right-left+1)
	i, l, r := 0, left, mid+1
	for l <= mid && r <= right {
		if arr[l] <= arr[r] {
			temp[i] = arr[l]
			l++
		} else {
			temp[i] = arr[r]
			r++
		}
		i++
	}
	for l <= mid {
		temp[i] = arr[l]
		i++
		l++
	}
	for r <= right {
		temp[i] = arr[r]
		i++
		r++
	}
	i = 0
	for j := left; j <= right; j++ {
		arr[j] = temp[i]
		i++
	}
}
