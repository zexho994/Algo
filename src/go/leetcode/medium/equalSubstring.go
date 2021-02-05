package medium

// 求出两个字符串的最大变化字串
// 1 求出每一位的变化代价
// 2 求出符合要求的最大长度
// 1,3,5,2,1,1,2  ;cost = 4
func equalSubstring(s string, t string, maxCost int) int {
	val := make([]int, len(s))
	left, curCost, ans := 0, 0, -1
	for right := 0; right < len(s); right++ {
		if u := int(s[right]) - int(t[right]); u < 0 {
			val[right] = -u
		} else {
			val[right] = u
		}
		if curCost += val[right]; curCost > maxCost {
			curCost -= val[left]
			left++
		} else {
			if d := right - left; d > ans {
				ans = d
			}
		}
	}
	return ans + 1
}
