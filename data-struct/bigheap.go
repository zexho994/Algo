package data_struct

type BigHeap struct {
	data []int
}

// 将arr变成一个大根堆,arr长度为len,假设索引从0开始
// 父节点求子节点位置：i => l = i*2 + 1; r = i*2 + 2
// 构造大根堆的逻辑：
// 1. 从最后一个位置开始，逐渐向前遍历，只需要遍历完叶子节点即可
// 2. 假设最后一个节点位置为i,i的父节点为(i-1)/2,如果arr[i] > arr[(i-1)/2],交换值,否则停止此轮交换
// 3. 重复步骤2，直到 i == getLeafCount()的值的位置
//          0
//       1     2
//     3  4   5 6
//   7 8 9 10
func NewBigHeap(arr []int) BigHeap {
	if arr == nil {
		panic("arr is nil")
	}
	tempArr := make([]int, len(arr))
	copy(tempArr, arr)
	size := len(arr)
	for i := size/2 - 1; i >= 0; i-- {
		t, s, r := i, 0, 0
		for s < size {
			l := t*2 + 1
			if l >= size {
				break
			}
			if s, r = l, l+1; r < size && tempArr[l] < tempArr[r] {
				s = r
			}
			if tempArr[s] > tempArr[t] {
				swap(t, s, tempArr)
			}
			t = s
		}
	}
	return BigHeap{data: tempArr}
}

func (heap *BigHeap) Push(n int) bool {
	heap.data = append(heap.data, n)
	i := len(heap.data) - 1
	for r := getParentIdx(i); r >= 0; r = getParentIdx(i) {
		if heap.data[i] < heap.data[r] {
			break
		}
		swap(i, r, heap.data)
		i = r
	}
	return true
}

// 确定叶子节点的数量=> num = len/2
func getLeafCount(length int) int {
	return length / 2
}

func getParentIdx(idx int) int {
	if idx < 0 {
		panic("idx is less than zero")
	}
	if idx == 0 {
		return -1
	}
	return (idx - 1) / 2
}

func swap(n1, n2 int, arr []int) {
	t := arr[n1]
	arr[n1] = arr[n2]
	arr[n2] = t
}
