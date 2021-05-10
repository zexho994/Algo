package daily_topic

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

func leafSimilar(root1 *TreeNode, root2 *TreeNode) bool {
	var memo []int
	var build func(node *TreeNode)
	var judge func(node *TreeNode) bool

	build = func(node *TreeNode) {
		if node == nil {
			return
		}
		if node.Left == nil && node.Right == nil {
			memo = append(memo, node.Val)
		}
		build(node.Left)
		build(node.Right)
	}
	n := 0
	judge = func(node *TreeNode) bool {
		if node == nil {
			return true
		}
		if node.Left == nil && node.Right == nil {
			if n == len(memo) {
				return false
			}
			if memo[n] != node.Val {
				return false
			}
			n++
			return true
		}
		return judge(node.Left) && judge(node.Right)
	}

	build(root1)
	return judge(root2) && n == len(memo)
}
