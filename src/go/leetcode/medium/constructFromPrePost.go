package medium

func constructFromPrePost(pre []int, post []int) *TreeNode {
	if len(pre) == 0 || len(post) == 0 {
		return nil
	}

	idx := 0
	for i, n := range post {
		if pre[1] == n {
			idx = i
			break
		}
	}

	leftArr := post[:idx+1]
	rightArr := post[idx+1:]
	node := &TreeNode{Val: pre[0]}
	node.Left = constructFromPrePost(pre[1:], leftArr)
	if 2+idx >= len(pre) {
		node.Right = nil
	} else {
		node.Right = constructFromPrePost(pre[2+idx:], rightArr)
	}

	return node
}
