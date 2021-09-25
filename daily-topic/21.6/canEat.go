package _1_6

func canEat(candiesCount []int, queries [][]int) []bool {
	presum := make([]int, len(candiesCount))
	for i := 1; i < len(candiesCount); i++ {
		presum[i] = presum[i-1] + candiesCount[i-1]
	}
	ans := make([]bool, len(queries))
	for i, q := range queries {
		t, d, c := q[0], q[1], q[2]
		if d >= presum[t]+candiesCount[t] || (d+1)*c <= presum[t] {
			ans[i] = false
		} else {
			ans[i] = true
		}

	}
	return ans
}
