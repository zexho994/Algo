package daily_topic

func sortColors(nums []int) {
	p, n, e := 0, 0, len(nums)-1
	swap := func(n1, n2 int) {
		tmp := nums[n1]
		nums[n1] = nums[n2]
		nums[n2] = tmp
	}
	i := 0
	for i <= e {
		if nums[i] == n {
			swap(i, p)
			p++
		}
		if i == e && n != 2 {
			n++
			i = p - 1
		}
		i++
	}
}
