package medium

// 验证二叉搜索树的合法性
func varify(node *TreeNode) bool {
	var traverse func(treeNode *TreeNode)
	var vals []int
	traverse = func(treeNode *TreeNode) {
		if treeNode == nil {
			return
		}
		traverse(treeNode.Left)
		vals = append(vals, treeNode.Val)
		traverse(treeNode.Right)
	}
	traverse(node)
	if len(vals) <= 1 {
		return true
	}
	for idx := range vals {
		if vals[idx] > vals[idx+1] {
			return false
		}
		if idx >= len(vals)-2 {
			break
		}
	}
	return true
}

// 删除子节点
// 删除操作中，需要使用左子树中最大的点或者右子树中最小的点来代替被删节点
func del(node *TreeNode, k int) *TreeNode {
	var findMax func(treeNode *TreeNode) *TreeNode
	findMax = func(treeNode *TreeNode) *TreeNode {
		if treeNode == nil || treeNode.Right == nil {
			return treeNode
		}
		return findMax(treeNode.Right)
	}

	targetNode := find(k, node)
	maxLeft := findMax(targetNode.Left)
	maxLeft.Left = targetNode.Left
	maxLeft.Right = targetNode.Right
	targetNode = maxLeft
	maxLeft = nil
	return node
}

// 添加节点节点
// 添加到叶子节点中
func add(k int, node *TreeNode) {
	newNode := &TreeNode{Val: k}
	for {
		if k < node.Val {
			if node.Left == nil {
				node.Left = newNode
				break
			} else {
				node = node.Left
			}
		} else {
			if node.Right == nil {
				node.Right = newNode
				break
			} else {
				node = node.Right
			}
		}
	}
}

// 查找
func find(k int, node *TreeNode) *TreeNode {
	for node != nil && k != node.Val {
		if k > node.Val {
			node = node.Right
		} else {
			node = node.Left
		}
	}
	return node
}
