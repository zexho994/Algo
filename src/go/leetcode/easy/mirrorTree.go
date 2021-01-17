package easy

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func mirrorTree(root *TreeNode) *TreeNode {
	if root == nil {
		return nil
	}

	n := root.Left
	root.Left = root.Right
	root.Right = n

	mirrorTree(root.Left)
	mirrorTree(root.Right)

	return root
}
