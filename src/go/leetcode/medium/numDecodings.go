package medium

import (
	"strconv"
)

// 91. 解码方法
// 时间复杂度为 O(n),使用map跳过重复的步骤，等同于对s的所有可能性只进行来1次遍历。
// 空间复杂度为 O(2n),使用来2倍长字符长度的map
func numDecodings(s string) int {
	if len(s) == 0 {
		return 0
	}
	if r, _ := strconv.ParseInt(string(s[0]), 10, 32); r == 0 {
		return 0
	}
	memo := make(map[string]int, len(s)*2)
	return dp(s, memo)
}

// 遇到下标为0的时候，该结果无效，返回0
// 使用map作为记录已转换过的字符串的结果，直接返回，不然会超时
func dp(s string, memo map[string]int) int {
	if memo[s] != 0 {
		return memo[s]
	}
	if len(s) == 0 {
		return 1
	}
	if r, _ := strconv.ParseInt(string(s[0]), 10, 32); r == 0 {
		return 0
	}
	if len(s) >= 2 {
		if r, _ := strconv.ParseInt(s[:2], 10, 32); r <= 26 {
			memo[s] = dp(s[2:], memo) + dp(s[1:], memo)
			return memo[s]
		}
	}
	memo[s] = dp(s[1:], memo)
	return memo[s]
}
