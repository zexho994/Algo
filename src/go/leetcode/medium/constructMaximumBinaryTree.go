package medium

// 654. 最大二叉树
func constructMaximumBinaryTree(nums []int) *TreeNode {
	if len(nums) == 0 {
		return nil
	}

	var maxValIdx = 0
	for idx, val := range nums {
		if val > nums[maxValIdx] {
			maxValIdx = idx
		}
	}
	node := &TreeNode{Val: nums[maxValIdx]}
	node.Left = constructMaximumBinaryTree(nums[:maxValIdx])
	if maxValIdx == len(nums) {
		node.Right = nil
	} else {
		node.Right = constructMaximumBinaryTree(nums[maxValIdx+1:])
	}

	return node
}
