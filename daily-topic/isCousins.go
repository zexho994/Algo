package daily_topic

func isCousins(root *TreeNode, x int, y int) bool {
	var stack []*TreeNode
	stack = append(stack, root)
	for len(stack) != 0 {
		l := len(stack)
		f := false
		seq1, seq2 := -1, -1
		for i := 0; i < l; i++ {
			n := stack[i]
			if n == nil {
				continue
			}
			if n.Val == x {
				f = true
				seq1 = i
			} else if n.Val == y {
				f = true
				seq2 = i
			}
			stack = append(stack, n.Left)
			stack = append(stack, n.Right)
		}
		if f {
			if seq1 == -1 || seq2 == -1 || seq1/2 == seq2/2 {
				return false
			} else {
				return true
			}
		}
		stack = stack[l:]
	}
	return false
}
