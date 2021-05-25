package interview

func cuttingRope2(n int) int {
	if n == 2 || n == 3 {return n - 1}
	sum := 1
	for n > 4{
		n -= 3
		sum *= 3
		sum %= 1000000007
	}
	return (sum * n) % 1000000007
}