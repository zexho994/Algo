package medium

import (
	"strconv"
)

func findDuplicateSubtrees(root *TreeNode) []*TreeNode {
	memo := make(map[string]int)
	var ans []*TreeNode

	serialization(root, memo, &ans)

	return ans
}

func serialization(node *TreeNode, memo map[string]int, ans *[]*TreeNode) string {
	if node == nil {
		return "#"
	}

	strLeft := serialization(node.Left, memo, ans)
	strRight := serialization(node.Right, memo, ans)
	s := strconv.Itoa(node.Val) + "," + strLeft + "," + strRight

	if val, ok := memo[s]; ok {
		if val == 1 {
			*ans = append(*ans, node)
		}
	}
	memo[s]++

	return s
}
