package _1_7

import (
	"fmt"
	"testing"
)

func Test_maxIceCream(t *testing.T) {
	cream := maxIceCream([]int{1, 3, 2, 4, 1}, 7)
	fmt.Println(cream)
}
