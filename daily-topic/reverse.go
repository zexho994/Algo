package daily_topic

func reverse(x int) int {
	var res int32
	for x != 0 {
		n := x % 10
		x /= 10
		if res*10/10 != res {
			return 0
		}
		res = res*10 + int32(n)
	}
	return int(res)
}
