package easy

import (
	"go/struct"
	"math"
)

func getMinimumDifference(root *_struct.TreeNode) int {
	var dfs func(node *_struct.TreeNode)
	dif, pre := math.MaxInt64, -1
	dfs = func(node *_struct.TreeNode) {
		if node == nil {
			return
		}
		dfs(node.Left)
		if pre != -1 && node.Val-pre < dif {
			dif = node.Val - pre
		}
		pre = node.Val
		dfs(node.Right)
	}
	dfs(root)
	return dif
}
