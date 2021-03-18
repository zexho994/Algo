package linked

type ListNode struct {
	Val  int
	Next *ListNode
}

// 修改值的方式
func reverseBetween(head ListNode, left int, right int) ListNode {
	dif := right - left
	memo := make(map[int]*ListNode, dif+1)
	// 找到位置
	lNode := &head
	for i := 1; i < left; i++ {
		lNode = lNode.Next
	}
	rNode := lNode
	for j := 0; j <= dif; j++ {
		memo[j] = rNode
		rNode = rNode.Next
	}
	// 进行翻转操作
	for i := 0; i < dif+1/2; i++ {
		t := memo[i].Val
		memo[i].Val = memo[dif-i].Val
		memo[dif-i].Val = t
	}

	// 返回
	return head
}

// 头插法
func reverseBetween1(head *ListNode, left int, right int) *ListNode {
	dumpNode := &ListNode{Val: -1, Next: head}
	pre := dumpNode
	for i := 1; i < left; i++ {
		pre = pre.Next
	}
	cur := pre.Next
	for i := 0; i < right-left; i++ {
		next := cur.Next
		cur.Next = next.Next
		next.Next = pre.Next
		pre.Next = next
	}
	return dumpNode.Next
}
