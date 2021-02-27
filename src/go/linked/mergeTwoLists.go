package linked

import "github.com/zouzhihao-994/Algo/src/go/linked/struct"

func mergeTwoLists(l1 *_struct.ListNode, l2 *_struct.ListNode) *_struct.ListNode {
	l := &_struct.ListNode{}
	h := l
	for l1 != nil && l2 != nil {
		if l1.Val < l2.Val {
			l.Next = &_struct.ListNode{Val: l1.Val}
			l1 = l1.Next
		} else {
			l.Next = &_struct.ListNode{Val: l2.Val}
			l2 = l2.Next
		}
		l = l.Next
	}
	for l1 != nil {
		l.Next = &_struct.ListNode{Val: l1.Val}
		l = l.Next
		l1 = l1.Next
	}
	for l2 != nil {
		l.Next = &_struct.ListNode{Val: l2.Val}
		l = l.Next
		l2 = l2.Next
	}

	return h.Next
}
