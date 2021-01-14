package easy

func prefixesDivBy5(A []int) []bool {
	val := 0
	ans := make([]bool, len(A))
	for idx, n := range A {
		val *= 2
		if n == 1 {
			val++
		}
		val %= 5
		ans[idx] = val == 0
	}
	return ans
}
