package daily_topic

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func increasingBST1(root *TreeNode) *TreeNode {
	newRoot := &TreeNode{}
	r := newRoot
	var inorder func(node *TreeNode)
	inorder = func(node *TreeNode) {
		if node == nil {
			return
		}
		inorder(node.Left)
		r.Right = node
		r.Left = nil
		r = node
		inorder(node.Right)
	}
	inorder(root)
	return newRoot.Right
}

func increasingBST2(root *TreeNode) *TreeNode {
	dummyNode := &TreeNode{}
	resNode := dummyNode

	var inorder func(*TreeNode)
	inorder = func(node *TreeNode) {
		if node == nil {
			return
		}
		inorder(node.Left)

		// 在中序遍历的过程中修改节点指向
		resNode.Right = node
		node.Left = nil
		resNode = node

		inorder(node.Right)
	}
	inorder(root)
	return dummyNode.Right
}
