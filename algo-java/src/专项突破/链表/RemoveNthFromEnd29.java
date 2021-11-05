package 专项突破.链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/5 3:03 下午
 */
public class RemoveNthFromEnd29 {

    // 1 -> 2 -> 3 -> 4 -> 5
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        ListNode fast = head, slow;
        while (n > 0 && fast != null) {
            n--;
            fast = fast.next;
        }
        if (n > 0 || fast == null) {
            return head.next;
        }

        slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
