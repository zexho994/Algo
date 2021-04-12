package medium

// res = 加完第一个 or 不加第二个
//
func subsets(nums []int) [][]int {
	var ans [][]int
	traverse(&ans, []int{}, 0, nums)
	return ans
}

func traverse(ans *[][]int, arr []int, n int, nums []int) {
	if n == len(nums) {
		*ans = append(*ans, append([]int{}, arr...))
		return
	}
	traverse(ans, arr, n+1, nums)
	arr = append(arr, nums[n])
	traverse(ans, arr, n+1, nums)
}
