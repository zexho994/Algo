package daily_topic

// 在 len(bloomDay) > m * k 时候，可以确保肯定有答案可以符合要求
// 确定区间 [min,max]
// 通过二分的方式在[min,max]中查找到最小的符合要求的值
func minDays(bloomDay []int, m int, k int) int {
	if len(bloomDay) < m*k {
		return -1
	}
	l, r := 0, 0
	for _, n := range bloomDay {
		if n < l {
			l = n
		}
		if n > r {
			r = n
		}
	}
	able := func(mid int) bool {
		flower, size := 0, 0
		for _, n := range bloomDay {
			if n <= mid {
				if flower += 1; flower == k {
					flower = 0
					if size += 1; size == m {
						return true
					}
				}
			} else {
				flower = 0
			}
		}
		return false
	}
	for l < r {
		mid := (r + l) / 2
		if able(mid) {
			r = mid
		} else {
			l = mid + 1
		}
	}
	return r
}
