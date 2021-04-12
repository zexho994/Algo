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

func deleteDuplicates1(head *ListNode) *ListNode {
    if head == nil {
        return nil
    }

    dummy := &ListNode{0, head}

    cur := dummy
    for cur.Next != nil && cur.Next.Next != nil {
        if cur.Next.Val == cur.Next.Next.Val {
            x := cur.Next.Val
            for cur.Next != nil && cur.Next.Val == x {
                cur.Next = cur.Next.Next
            }
        } else {
            cur = cur.Next
        }
    }

    return dummy.Next
}

func deleteDuplicates2(head *ListNode) *ListNode {
	if head == nil {
		return head
	}
	n := head
	for n.Next != nil {
		if n.Val == n.Next.Val{
			n.Next = n.Next.Next
			continue
		}
		n = n.Next
	}
	return head
}