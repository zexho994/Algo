package sort

import (
	"fmt"
	"testing"
)

func TestMerge(t *testing.T) {
	arr := []int{1, 5, 12, 7, 9, 23, 0, 2}
	mergeSort(arr)
	for _, i2 := range arr {
		fmt.Println(i2)
	}
}
