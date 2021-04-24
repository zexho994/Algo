package daily_topic

// arr[n] = arr[x] * arr[y]
// 题解： https://leetcode-cn.com/problems/combination-sum-iv/solution/go-dp-100-tu-cao-by-zouzhihao-wttz/
func combinationSum4(nums []int, target int) int {
	memo := make([]int, target+1)
	memo[0] = 1
	for i := 1; i <= target; i++ {
		for _, n := range nums {
			if i-n >= 0 {
				memo[i] += memo[i-n]
			}
		}
	}
	return memo[target]
}
