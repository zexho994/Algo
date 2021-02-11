package medium

func findAnagrams(s string, p string) []int {
	pArr := make([]int, 26)
	for i := range p {
		pArr[p[i]-'a']++
	}
	rArr := make([]int, 26)
	curSize, left := 0, 0
	var ans []int
	for i := range s {
		idx := s[i] - 'a'
		// 不是p中的呢，不需要： left = i, curSize = 0
		if pArr[idx] == 0 {
			curSize = 0
			left = i + 1
			rArr = make([]int, 26)
			continue
		}

		if pArr[idx] == rArr[idx] {
			for ; pArr[idx] == rArr[idx]; left++ {
				rArr[s[left]-'a']--
				curSize--
			}

		}
		// 如果该字符已达到要求,获取符合要求的新区间
		curSize++
		rArr[idx]++
		if curSize == len(p) {
			ans = append(ans, left)
		}
	}
	return ans
}
