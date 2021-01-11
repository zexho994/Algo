package easy

import "strconv"

func summaryRanges(nums []int) []string {
	var ans []string
	if len(nums) == 0 {
		return ans
	}
	arrow := func(s, e int) {
		if s == e {
			ans = append(ans, strconv.Itoa(s))
			return
		}
		ans = append(ans, strconv.Itoa(s)+"->"+strconv.Itoa(e))
	}
	l := len(nums)
	s, e := 0, 1
	for ; e < l; e++ {
		if nums[e]-nums[e-1] > 1 {
			arrow(nums[s], nums[e-1])
			s = e
		}
	}
	arrow(nums[s], nums[e-1])
	return ans
}
