package daily_topic

func deleteAndEarn(nums []int) int {
	maxVal := 0
	for _, n := range nums {
		maxVal = Max(n, maxVal)
	}
	arr := make([]int, maxVal+1)
	for _, n := range nums {
		arr[n] += n
	}
	for i := 2; i <= maxVal; i++ {
		arr[i] = Max(arr[i-1], arr[i-2]+arr[i])
	}
	return arr[maxVal]
}

func Max(n1, n2 int) int {
	if n1 > n2 {
		return n1
	}
	return n2
}
