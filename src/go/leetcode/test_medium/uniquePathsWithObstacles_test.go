package test_medium

import (
	"github.com/zouzhihao-994/Algo/src/go/leetcode/medium"
	"testing"
)

func TestUniquePathsWithObstacles(t *testing.T) {
	arr := [][]int{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}
	ans := medium.UniquePathsWithObstacles(arr)
	if ans != 2 {
		panic("test fail!")
	}
}
