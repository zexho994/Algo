package daily_topic

func decode(encoded []int, first int) []int {
	arr := make([]int, len(encoded)+1)
	arr[0] = first
	for i, n := range encoded {
		arr[i+1] = n ^ first
		first = arr[i+1]
	}
	return arr
}
