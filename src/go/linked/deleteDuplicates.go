package linked

import _struct "github.com/zouzhihao-994/Algo/src/go/linked/struct"

func deleteDuplicates(head *_struct.ListNode) *_struct.ListNode {
	memo := make(map[int]int)
	t := head
	for t != nil {
		memo[t.Val]++
		t = t.Next
	}
	h := &_struct.ListNode{Next: head}
	for h.Next != nil {
		if memo[h.Next.Val] > 1 {
			h.Next = h.Next.Next
			continue
		}
		h = h.Next
	}
	return h.Next
}
