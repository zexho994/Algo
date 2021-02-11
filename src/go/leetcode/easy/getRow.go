package easy

//119. 杨辉三角 II
func getRow(rowIndex int) []int {
	ans := make([]int, rowIndex+1)
	ans[0] = 1
	for firstL := 0; firstL <= rowIndex; firstL++ {
		for twoL := firstL; twoL > 0; twoL-- {
			ans[twoL] += ans[twoL-1]
		}
	}
	return ans
}
