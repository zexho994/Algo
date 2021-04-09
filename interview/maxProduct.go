package interview

func maxProduct(nums []int) int {
	memo := make([][]int, 2)
	// memo[0][i] => i位置的最大值
	// memo[1][i] => i位置的最小值
	memo[0], memo[1] = make([]int, len(nums)), make([]int, len(nums))
	memo[0][0], memo[1][0] = nums[0], nums[0]
	max := nums[0]
	// condition 为true，返回n1,n2 大值
	If := func(condition bool, n1, n2 int) int {
		if (condition && n1 > n2) || (!condition && n1 < n2) {
			return n1
		}
		return n2
	}
	// dp
	for i := 1; i < len(nums); i++ {
		if nums[i] < 0 {
			memo[0][i] = If(true, memo[0][i-1]*nums[i], nums[i])
			memo[1][i] = If(false, memo[1][i-1]*nums[i], nums[i])
		} else {
			memo[0][i] = If(true, memo[1][i-1]*nums[i], nums[i])
			memo[1][i] = If(false, memo[0][i-1]*nums[i], nums[i])
		}
		max = If(true, max, memo[0][i])
	}
	return max
}
