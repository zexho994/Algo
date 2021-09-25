package _1_6

import (
	"fmt"
	"testing"
)

func Test_throne(t *testing.T) {
	order := Constructor("king")
	order.Birth("king", "a")
	order.Birth("king", "b")
	order.Birth("king", "c")
	order.Birth("a", "d")
	order.Birth("a", "e")
	order.Birth("b", "f")
	order.Birth("c", "g")
	r := order.GetInheritanceOrder()
	fmt.Println("first")
	for _, n := range r {
		fmt.Println(n)
	}
	order.Death("a")
	order.Death("f")
	order.Death("c")
	r = order.GetInheritanceOrder()
	fmt.Println("second")
	for _, n := range r {
		fmt.Println(n)
	}
}
