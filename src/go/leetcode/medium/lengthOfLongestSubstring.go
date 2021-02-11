package medium

func lengthOfLongestSubstring(s string) int {
	if len(s) == 0 {
		return 0
	}
	memo := make(map[string]int, len(s))
	left, maxLen := 0, 0
	for i, c := range s {
		key := string(c)
		for ; memo[key] != 0; left++ {
			memo[string(s[left])]--
		}
		memo[key]++
		if curLen := i - left; curLen > maxLen {
			maxLen = curLen
		}
	}
	return maxLen + 1
}
