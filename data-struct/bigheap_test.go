package data_struct

import (
	"testing"
)

var mockArr1 = []int{1, 40, 28, 7, 26, 82, 83, 22, 12, 35, 63, 1, 57, 3, 24, 67, 34, 12, 35, 376, 7, 23, 44, 23, 5, 24, 36, 5, 74, 5, 2, 4, 12, 4, 236, 45, 7}
var mockArr2 = []int{23, 5, 46, 87, 23, 44, 2, 34, 35, 78, 23, 9, 5, 74, 83, 90, 19, 2, 73, 65, 47, 91}
var mockArr3 = []int{84, 75, 63, 82, 92, 73, 46, 45, 65, 83, 92, 74, 65, 56, 28, 19, 28, 79, 47, 46, 25}
var mockArr4 = []int{98, 6, 5, 4, 3, 6, 88, 76, 42, 13, 57, 87, 54, 68, 83, 34, 82, 46, 72, 58, 12, 36, 17, 45, 89, 67, 23, 65}

func TestNewBigHeap(t *testing.T) {
	heap1 := NewBigHeap(mockArr1)
	checkBigHeap(0, heap1.data)
	heap2 := NewBigHeap(mockArr2)
	checkBigHeap(0, heap2.data)
	heap3 := NewBigHeap(mockArr3)
	checkBigHeap(0, heap3.data)
	heap4 := NewBigHeap(mockArr4)
	checkBigHeap(0, heap4.data)
}

func TestBigHeap_Push(t *testing.T) {
	heap1 := NewBigHeap(mockArr1)
	heap1.Push(4)
	checkBigHeap(0, heap1.data)
	heap1.Push(49)
	checkBigHeap(0, heap1.data)
	heap1.Push(447)
	checkBigHeap(0, heap1.data)
	heap1.Push(97)
}

func checkBigHeap(i int, arr []int) {
	if i >= len(arr) {
		return
	}
	if i*2+1 < len(arr) && arr[i] < arr[i*2+1] {
		panic("arr is not a BigHeap")
	}
	if i*2+2 < len(arr) && arr[i] < arr[i*2+2] {
		panic("arr is not a BigHeap")
	}
	checkBigHeap(i*2+1, arr)
	checkBigHeap(i*2+2, arr)
}
