package daily_topic

func rangeSumBST(root *TreeNode, low int, high int) int {
	var inorder func(node *TreeNode) int
	inorder = func(node *TreeNode) int {
		if node == nil {
			return 0
		}
		if node.Val < low {
			return inorder(node.Right)
		}
		if node.Val > high {
			return inorder(node.Left)
		}
		return node.Val + inorder(node.Left) + inorder(node.Right)
	}
	return inorder(root)
}
