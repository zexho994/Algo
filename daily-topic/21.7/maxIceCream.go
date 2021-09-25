package _1_7

func maxIceCream(costs []int, coins int) int {
	arr := make([]int, coins+1)
	for _, c := range costs {
		if c > coins {
			continue
		}
		arr[c] += 1
	}
	cost, num := 0, 0
	for i, n := range arr {
		for j := 0; j < n; j++ {
			cost += i
			if cost > coins {
				return num
			}
			num++
		}
	}
	return num
}
