package hard

func minKBitFlips(A []int, K int) (ans int) {
	n := len(A)
	revCnt := 0
	for i, v := range A {
		if i >= K && A[i-K] > 1 {
			revCnt ^= 1
			A[i-K] -= 2 // 复原数组元素，若允许修改数组 A，则可以省略
		}
		if v == revCnt {
			if i+K > n {
				return -1
			}
			ans++
			revCnt ^= 1
			A[i] += 2
		}
	}
	return
}
