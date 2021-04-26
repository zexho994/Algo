package daily_topic

func shipWithinDays(weights []int, D int) int {
	max, sum, mid := 0, 0, 0
	for _, n := range weights {
		if n > max {
			max = n
		}
		sum += n
	}
	verify := func(max int) bool {
		cur, day := 0, 1
		for _, n := range weights {
			if cur += n; cur > max {
				if day += 1; day > D {
					return false
				}
				cur = n
			}
		}
		return true
	}
	for max < sum {
		if mid = (max + sum) >> 1; verify(mid) {
			sum = mid
		} else {
			max = mid + 1
		}
	}
	return max
}
