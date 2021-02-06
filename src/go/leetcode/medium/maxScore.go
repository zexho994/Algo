package medium

func maxScore(cardPoints []int, k int) int {
	if k <= 0 {
		return 0
	}
	max := 0
	for i := 0; i < k; i++ {
		max += cardPoints[i]
	}
	if k >= len(cardPoints) {
		return max
	}
	cur := max
	l := len(cardPoints)
	for i := 1; i <= k; i++ {
		cur -= cardPoints[k-i]
		cur += cardPoints[l-i]
		if cur > max {
			max = cur
		}
	}
	return max
}
