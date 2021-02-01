package easy

// 暴力法
func fairCandySwap(A []int, B []int) []int {
	sumA, sumB := 0, 0
	for _, a := range A {
		sumA += a
	}
	for _, b := range B {
		sumB += b
	}
	dif := sumA - sumB
	if dif > 0 {

	} else if dif < 0 {
		dif = -dif
	} else {
		return []int{0, 0}
	}
	for _, a := range A {
		n := (dif + 2*a) / 2
		for _, b := range B {
			if b == n {
				return []int{a, b}
			}
		}
	}
	return nil
}

// hash table
func fairCandySwap2(A []int, B []int) []int {
	mapB := make(map[int]bool, len(B))
	sumA, sumB := 0, 0
	for _, a := range A {
		sumA += a
	}
	for _, b := range B {
		mapB[b] = true
		sumB += b
	}
	dif := -(sumA - sumB)
	for _, a := range A {
		n := (dif + 2*a) >> 1
		if mapB[n] == true {
			return []int{a, n}
		}
	}
	return nil
}
