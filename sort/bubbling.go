package sort

import (
	"fmt"
	"strconv"
)

func bubblingSort(nums []int) []int {
	for i := 0; i < len(nums); i++ {
		for j := i; j < len(nums); j++ {
			if nums[j] < nums[i] {
				t := nums[i]
				nums[i] = nums[j]
				nums[j] = t
			}
		}
	}
	for i := range nums {
		fmt.Println(strconv.Itoa(nums[i]) + ",")
	}
	return nums
}
