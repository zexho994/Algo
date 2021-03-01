package dp

/**
 * Your NumArray object will be instantiated and called as such:
 * obj := Constructor(nums);
 * param_1 := obj.SumRange(i,j);
 */
type NumArray struct {
	nums []int
}

func Constructor(nums []int) NumArray {
	if nums == nil || len(nums) < 1 {
		return NumArray{nums: []int{}}
	}
	prefixArr := make([]int, len(nums))
	prefixArr[0] = nums[0]
	for idx := 1; idx < len(nums); idx++ {
		prefixArr[idx] = prefixArr[idx-1] + nums[idx]
	}
	return NumArray{nums: prefixArr}
}

func (this *NumArray) SumRange(i int, j int) int {
	var smallNum int
	if i == 0 {
		smallNum = 0
	} else {
		smallNum = this.nums[i-1]
	}
	return this.nums[j] - smallNum
}
