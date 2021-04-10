package lib

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// f =true ,必须染
func maxValue(root *TreeNode, k int) int {
	dp := func(node *TreeNode, s int, f bool) int { return 0 }
	dp = func(node *TreeNode, s int, f bool) int {
		if node == nil {
			return 0
		}
		if s <= 0 {
			if f {
				return dp(node.Left, -1, false) + dp(node.Right, -1, false) + node.Val
			}
			return dp(node.Left, k, false) + dp(node.Right, k, false)
		}
		max := dp(node.Left, k, false) + dp(node.Right, k, false)

		s--
		// 左右都不染
		l1 := dp(node.Left, -1, false)
		r1 := dp(node.Right, -1, false)
		n1 := r1 + l1 + node.Val
		max = getMax(max, n1)

		// 左节点染,右节点不染
		if node.Left != nil && s != 0 {
			n2 := dp(node.Left, s, false) + r1 + node.Val
			max = getMax(max, n2)
		}

		// 左节点不染，右节点染
		if node.Right != nil && s != 0 {
			n3 := l1 + dp(node.Right, s, false) + node.Val
			max = getMax(max, n3)
		}

		// 左右都染
		if s >= 2 && node.Left != nil && node.Right != nil {
			n4 := dp(node.Left, s-2, true) + dp(node.Right, s-2, true) + node.Val
			max = getMax(max, n4)
		}
		return max
	}
	return dp(root, k, false)
}

func getMax(n1, n2 int) int {
	if n1 > n2 {
		return n1
	}
	return n2
}
