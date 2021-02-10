package medium

// 一个map1记录是s1的字符情况
// 利用双指针进行判断记录的map2是否和map1相等
func checkInclusion(s1 string, s2 string) bool {
	// 记录s1字符情况
	s1_map := make(map[string]int, len(s1))
	for _, s := range s1 {
		s1_map[string(s)]++
	}
	// 双指针进行判断
	s2_map := make(map[string]int, len(s1))
	left := 0
	for idx, s := range s2 {
		ch := string(s)
		if s1_map[ch] == 0 {
			if compareMap(s1_map, s2_map) {
				return true
			}
			s2_map = make(map[string]int, len(s1))
			left = idx
			continue
		}
		if s1_map[ch] > s2_map[ch] { // 可以新增
			s2_map[ch]++
			continue
		}
		// 需要删除一个旧的来新增
		if compareMap(s1_map, s2_map) {
			return true
		}
		for {
			l := string(s2[left])
			left++
			if l == ch {
				break
			}
			s2_map[l]--
		}

	}
	return compareMap(s1_map, s2_map)
}

func compareMap(map1, map2 map[string]int) bool {
	for k, v := range map1 {
		if v != map2[k] {
			return false
		}
	}
	return true
}
