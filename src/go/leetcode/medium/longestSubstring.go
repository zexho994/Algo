package medium

import "strings"

// 记录已经出现的字符，记录出现字符的次数
func longestSubstring(s string, k int) int {
	if len(s) < k {
		return 0
	}
	allCharsMap := make(map[string]int, 26)
	for _, c := range s {
		allCharsMap[string(c)]++
	}
	maxLen := 0
	for _, c := range s {
		if allCharsMap[string(c)] < k {
			arr := strings.Split(s, string(c))
			for _, str := range arr {
				if str == "" {
					continue
				}
				if r := longestSubstring(str, k); r > maxLen {
					maxLen = r
				}
			}
			return maxLen
		}
	}
	return len(s)
}
