package hard

// s中包含t的最小字串
// s = "ADOBECODEBANC" , t = "ABC"
func minWindow(s string, t string) string {
	reqMap := make(map[string]int)
	count, req, minStr, left := 0, len(t), s+"1", 0
	for _, c := range t {
		reqMap[string(c)]++
	}
	memo := make(map[string]int)
	for i, c := range s {
		sc := string(c)
		if reqMap[sc] == 0 {
			continue
		}
		if memo[sc] < reqMap[sc] {
			count++
		}
		memo[sc]++
		for count == req {
			toDel := string(s[left])
			if memo[toDel] == 0 {
				left++
				continue
			}
			memo[toDel]--
			if memo[toDel] >= reqMap[toDel] {
				left++
				continue
			}
			if i-left < len(minStr) {
				minStr = s[left : i+1]
			}
			left++
			count--
		}
	}
	if minStr == s+"1" {
		return ""
	}
	return minStr
}
