package easy

// i > i + 1
//    1. 减小i
//    2. 增大i+1
// 4,2,3
// 3,4,2,3
func checkPossibility(nums []int) bool {
	if len(nums) <= 2 {
		return true
	}
	for i, n := 0, 0; i < len(nums)-1; i++ {
		if x, y := nums[i], nums[i+1]; x > y {
			if n == 1 {
				return false
			}
			if i > 0 && y < nums[i-1] {
				nums[i+1] = x
			}
			n++
		}
	}
	return true
}
