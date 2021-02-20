package easy

func findShortestSubArray(nums []int) int {
	memo := make(map[int]int, len(nums))
	degree, minLen := 0, len(nums)
	for _, n := range nums {
		memo[n]++
		if memo[n] > degree {
			degree = memo[n]
		}
	}
	for i, n := range nums {
		if memo[n] == degree {
			// 找到该数字的度
			count := 1
			for right := i + 1; right < len(nums); right++ {
				if nums[right] == n {
					count++
				}
				if count == degree {
					if l := right - i; l < minLen {
						minLen = l
					}
					memo[n]++
					break
				}
			}
		}
	}
	return minLen + 1
}
