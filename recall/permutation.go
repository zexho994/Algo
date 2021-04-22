package recall

func permutation(s string) []string {
	chArr := []byte(s)
	var ans []string
	swap := func(i1, i2 int) {
		t := chArr[i1]
		chArr[i1] = chArr[i2]
		chArr[i2] = t
	}
	rc := func(i int) {}
	rc = func(i int) {
		if i == len(chArr) {
			ans = append(ans, string(chArr))
		}
		memo := make(map[string]bool, len(chArr)-i)
		for j := i; j < len(chArr); j++ {
			if memo[string(chArr[j])] {
				continue
			}
			swap(i, j)
			rc(i + 1)
			swap(i, j)
			memo[string(chArr[j])] = true
		}
	}
	rc(0)
	return ans
}
