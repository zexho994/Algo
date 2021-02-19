package medium

import "math"

func minOperations(nums []int, x int) int {
	arrLen := len(nums) - 1
	left, right, curSize, opCount, minOpCount := 0, arrLen, 0, 0, math.MaxInt32
	for idx, n := range nums {
		opCount++
		curSize += n
		if curSize == x {
			minOpCount = opCount
			left = idx
			goto A
		}
		if curSize > x {
			if idx == arrLen {
				return -1
			}
			left = idx
			goto A
		}
	}
	return -1
A:
	for ; left >= 0; left-- {
		curSize -= nums[left]
		opCount--
		for curSize < x && left < right {
			curSize += nums[right]
			right--
			opCount++
		}
		if curSize == x && opCount < minOpCount {
			minOpCount = opCount
		}
	}

	if minOpCount == math.MaxInt32 {
		return -1
	}
	return minOpCount
}
