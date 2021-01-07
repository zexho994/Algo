package test_medium

import (
	"github.com/zouzhihao-994/Algo/src/go/leetcode/medium"
	"testing"
)

func TestFindCircleNum(t *testing.T) {
	var a = [][]int{{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}}
	medium.FindCircleNum(a)
}
