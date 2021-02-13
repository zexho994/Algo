package easy

func findDisappearedNumbers(nums []int) []int {
	l := len(nums)
	for _, n := range nums {
		v := (n - 1) % l
		nums[v] += l
	}
	var arr []int
	for i, n := range nums {
		if n <= l {
			arr = append(arr, i+1)
		}
	}
	return arr
}
