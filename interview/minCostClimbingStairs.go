package interview

func minCostClimbingStairs(cost []int) int {
	if cost == nil || len(cost) < 2 {
		return 0
	}
	min, one, two := 0, cost[0], cost[1]
	If := func(c bool, n1, n2 int) int {
		if c {
			return n1
		}
		return n2
	}
	for i := 2; i < len(cost); i++ {
		min = If(one < two, one, two) + cost[i]
		one, two = two, min
	}
	return If(one < two, one, two)
}
