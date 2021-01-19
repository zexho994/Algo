package easy

// 面试题 04.02. 最小高度树
func sortedArrayToBST(nums []int) *TreeNode {
	return f(0, len(nums)-1, nums)
}

func f(l, r int, nums []int) *TreeNode {
	if l > r {
		return nil
	}
	mid := (r-l)>>1 + l
	node := &TreeNode{Val: nums[mid]}
	node.Left = f(l, mid-1, nums)
	node.Right = f(mid+1, r, nums)
	return node
}
