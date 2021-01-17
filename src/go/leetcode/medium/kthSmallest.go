package medium

// 二叉搜索树的第k小的值就是中序遍历结果数组中下标k-1的值
// 一次中序遍历构造树数组
func kthSmallest(root *TreeNode, k int) int {
	var arr []int
	lookup(root, &arr)
	return arr[k-1]
}

func lookup(node *TreeNode, arr *[]int) {
	if node == nil {
		return
	}
	lookup(node.Left, arr)
	*arr = append(*arr, node.Val)
	lookup(node.Right, arr)
}
