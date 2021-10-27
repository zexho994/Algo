package interview

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func isSubStructure(A *TreeNode, B *TreeNode) bool {
	if A == nil || B == nil {
		return false
	}
	var order func(na, nb *TreeNode) bool
	order = func(na, nb *TreeNode) bool {
		if nb == nil {
			return true
		}
		if na == nil {
			return false
		}
		if na.Val == nb.Val {
			if order(na.Left, nb.Left) && order(na.Right, nb.Right) {
				return true
			}
		}
		if order(na.Left, nb) || order(na.Right, nb) {
			return true
		}
		return false
	}
	return order(A, B)
}
