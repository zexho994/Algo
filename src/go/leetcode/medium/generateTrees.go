package medium

type TreeNode struct {
	Val   int
	Left  *TreeNode
	Right *TreeNode
}

// 95. 不同的二叉搜索树 II
func generateTrees(n int) []*TreeNode {
	if n <= 0 {
		return nil
	}
	return generateTreesDp(1, n)
}

func generateTreesDp(start, end int) []*TreeNode {
	if start > end {
		return []*TreeNode{nil}
	}
	var res []*TreeNode
	for s := start; s <= end; s++ {
		lefts := generateTreesDp(start, s-1)
		rights := generateTreesDp(s+1, end)
		for _, l := range lefts {
			for _, r := range rights {
				node := &TreeNode{Val: s}
				node.Left = l
				node.Right = r
				res = append(res, node)
			}
		}
	}
	return res
}
