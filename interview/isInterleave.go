package interview

func isInterleave(s1 string, s2 string, s3 string) bool {
	if len(s1)+len(s2) != len(s3) {
		return false
	}
	f := func(i1, i2, i3 int) bool { return true }
	f = func(i1, i2, i3 int) bool {
		for i3 < len(s3) {
			if i1 == len(s1) {
				for i2 < len(s2) {
					if s2[i2] != s3[i3] {
						return false
					}
					i3++
					i2++
				}
				return true
			}
			if i2 == len(s2) {
				for i1 < len(s1) {
					if s1[i1] != s3[i3] {
						return false
					}
					i3++
					i1++
				}
				return true
			}
			if s1[i1] == s2[i2] {
				if s1[i1] != s3[i3] {
					return false
				}
				return f(i1+1, i2, i3) || f(i1, i2+1, i3)
			}
			if s1[i1] == s3[i3] {
				i3++
				i1++
			} else if s2[i2] == s3[i3] {
				i3++
				i2++
			} else {
				return false
			}
		}
		return true
	}
	return f(0, 0, 0)
}
