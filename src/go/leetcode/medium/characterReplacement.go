package medium

// 区间始终保存时长度是： 历史最大长度 = 某个字符的首尾长度 + k
// 所以最后返回len(s) - left = 历史最大长度，也就是最大的子串了
func characterReplacement(s string, k int) int {
	ans := [26]int{}
	max, left := 0, 0
	for right, c := range s {
		i := c - 'A'
		ans[i]++
		if max < ans[i] {
			max = ans[i]
		}
		if max+k < right-left+1 {
			ans[s[left]-'A']--
			left++
		}
	}
	return len(s) - left
}
