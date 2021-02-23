package medium

func maxSatisfied(customers []int, grumpy []int, X int) int {
	baseScore, ableScore := 0, 0
	for i := 0; i < X; i++ {
		if grumpy[i] == 1 {
			ableScore += customers[i]
		} else {
			baseScore += customers[i]
		}
	}
	curScore, left := ableScore, 0
	for i := X; i < len(customers); i++ {
		if grumpy[i] == 1 {
			curScore += customers[i]
		} else {
			baseScore += customers[i]
		}
		if grumpy[left] == 1 {
			curScore -= customers[left]
		}
		left++
		if curScore > ableScore {
			ableScore = curScore
		}
	}
	return ableScore + baseScore
}
