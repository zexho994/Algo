package array

//
func isMonotonic(A []int) bool {
	inc, dec := false, false
	for i := 0; i < len(A)-1; i++ {
		if A[i]-A[i+1] > 0 {
			if inc {
				return false
			}
			dec = true
		} else if A[i]-A[i+1] < 0 {
			if dec {
				return false
			}
			inc = true
		}
	}
	return !(inc && dec)
}
