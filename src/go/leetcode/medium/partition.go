package medium

type ListNode struct {
	Val  int
	Next *ListNode
}

// 链表的裁剪
// h pre pos
// pre.next = pos.next
// pos.next = h.next
// h.next = pos
// pos = pre.next
func partition(head *ListNode, x int) *ListNode {
	resHead := &ListNode{Next: head}
	pos := head
	prePos := resHead
	for pos != nil && pos.Val < x {
		prePos = pos
		pos = pos.Next
	}
	h := prePos
	pos = prePos.Next
	for pos != nil {
		if pos.Val < x {
			prePos.Next = pos.Next
			pos.Next = h.Next
			h.Next = pos
			pos = prePos.Next
			h = h.Next
		} else {
			prePos = pos
			pos = pos.Next
		}
	}
	return resHead.Next
}

// 双链表
func partition2(head *ListNode, x int) *ListNode {
	small := &ListNode{}
	large := &ListNode{}
	s := small
	l := large
	for head != nil {
		if head.Val < x {
			small.Next = &ListNode{Val: head.Val}
			small = small.Next
		} else {
			large.Next = &ListNode{Val: head.Val}
			large = large.Next
		}
		head = head.Next
	}
	if s.Next != nil {
		s = s.Next
		small.Next = l.Next
		return s
	}
	return l.Next
}
