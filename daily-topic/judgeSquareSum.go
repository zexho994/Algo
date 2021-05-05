package daily_topic

import "math"

func judgeSquareSum(c int) bool {
	l, r := 0, int(math.Sqrt(float64(c)))
	for l <= r {
		s := l*l + r*r
		if s > c {
			r--
		} else if s < c {
			l++
		} else {
			return true
		}
	}
	return false
}
