package sort

import "testing"

func TestQuick(*testing.T) {
	arr := []int{1, 12, 23, 0, 5, 2, 1, 7, 9, 12, 7, 9, 23, 0, 2}
	quickSort(arr)
	for _, n := range arr {
		println(n)
	}
}
