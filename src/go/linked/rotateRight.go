package linked

import "github.com/zouzhihao-994/Algo/src/go/linked/struct"

func rotateRight(head *_struct.ListNode, k int) *_struct.ListNode {
	listLen := 1
	end := head
	// find the last position of list
	for end.Next != nil {
		listLen++
		end = end.Next
	}

	// find the position of K, listLen - K bnm
	k = k % listLen
	p := head
	for i := 0; i < listLen-k; i++ {
		p = p.Next
	}

	// update the sequence of list
	h := p.Next
	p.Next = nil
	end.Next = head

	return h
}
