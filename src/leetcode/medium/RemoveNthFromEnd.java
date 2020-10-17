package leetcode.medium;

import struct.ListNode.ListNode;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h = new ListNode();
        ListNode fast = head;
        int i = 0;
        while(i < n && fast != null){
            fast = fast.next;
            i++;
        }
        h.next = head;
        ListNode slow = h;
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return h.next;
    }
}
