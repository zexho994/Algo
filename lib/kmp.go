package lib

func matcher(s1, s2 string) (i1, i2 int) {
	pma := buildPMA(s2)
	l1, l2 := len(s1)-1, len(s2)-1
	for i := 0; i <= l1-l2; {
		t := i
		for j := 0; j <= l2; {
			if s1[t] != s2[j] {
				i += j - pma[j]
				break
			}
			if j == l2 {
				return i, i + j
			}
			j++
			t++
		}
	}
	return -1, -1
}

func buildPMA(str string) []int {
	var pma []int
	pma = append(pma, -1)
	if len(str) < 2 {
		return pma
	}
	pma = append(pma, 0)
	for i := 2; i < len(str); i++ {
		count, p, s := -1, "", ""
		for j := 0; j < i-1; j++ {
			p = p + string(str[j])
			s = string(str[i-j-1]) + s
			if p == s {
				count = j
			}
		}
		pma = append(pma, count+1)
	}
	return pma
}
