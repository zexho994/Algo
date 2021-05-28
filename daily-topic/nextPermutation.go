package daily_topic

func nextPermutation(nums []int) {
	for i := len(nums) - 2; i >= 0; i-- {
		min := i
		for j := len(nums) - 1; j > i; j-- {
			if (nums[j] > nums[i]) && (min == i || nums[j] < nums[min]) {
				min = j
			}
		}
		if min != i {
			tmp := nums[min]
			for k := min; k > i; k-- {
				nums[k] = nums[k-1]
			}
			nums[i] = tmp
			return
		}
	}
	for i := 0; i < len(nums)/2; i++ {
		t := nums[i]
		nums[i] = nums[len(nums)-1-i]
		nums[len(nums)-1-i] = t
	}
}
