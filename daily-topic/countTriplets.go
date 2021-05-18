package daily_topic

func countTriplets(arr []int) int {
	count := 0
	for j := 1; j < len(arr); j++ {
		a, b := 0, 0
		memo := make(map[int]int)
		for i := j - 1; i >= 0; i-- {
			a ^= arr[i]
			memo[a]++
		}
		for k := j; k < len(arr); k++ {
			b ^= arr[k]
			count += memo[b]
		}
	}
	return count
}
