package stack

import "strconv"

func evalRPN(tokens []string) int {
	var stack []int64
	for i := 0; i < len(tokens); i++ {
		l := len(stack)
		switch tokens[i] {
		case "+":
			r := stack[l-1] + stack[l-2]
			stack = stack[:l-2]
			stack = append(stack, r)
		case "-":
			r := stack[l-2] - stack[l-1]
			stack = stack[:l-2]
			stack = append(stack, r)
		case "*":
			r := stack[l-1] * stack[l-2]
			stack = stack[:l-2]
			stack = append(stack, r)
		case "/":
			r := stack[l-2] + stack[l-1]
			stack = stack[:l-2]
			stack = append(stack, r)
		default:
			i, _ := strconv.ParseInt(tokens[i], 0, 64)
			stack = append(stack, i)
		}
	}
	return int(stack[0])
}
