package daily_topic

// 遍历
func xorQueries(arr []int, queries [][]int) []int {
	ans := make([]int, len(queries))
	for idx, query := range queries {
		i, n := query[0], 0
		for ; i <= query[1]; i++ {
			n ^= arr[i]
		}
		ans[idx] = n
	}
	return ans
}

// 前缀和
func xorQueries1(arr []int, queries [][]int) []int {
	memo := make([]int, len(arr)+1)
	for i, n := range arr {
		memo[i+1] = memo[i] ^ n
	}
	ans := make([]int, len(queries))
	for i, q := range queries {
		ans[i] = memo[q[1]+1] ^ memo[q[0]]
	}
	return ans
}
