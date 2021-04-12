package interview

func cuttingRope(n int) int {
	if n == 2 || n == 3 {return n-1}
	memo := make([]int,n+1)
	memo[0],memo[1],memo[2],memo[3] = 0,1,2,3
	for i := 4; i <= n; i++{
		for j := i - 2; j >= (i+1)/2; j--{
			if n := memo[i-j]*memo[j]; n > memo[i]{
				memo[i] = n
			}
		}
	}
	return memo[n]
}