package 专项突破.链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/9 3:55 下午
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode fast = head;
        ListNode slow = head;
        while ((fast = fast.next) != null && (fast = fast.next) != null) {
            slow = slow.next;
        }
        fast = slow.next;
        slow.next = null;
        fast = reverse(fast);
        reorder(head, fast);
    }

    /**
     * return the head of new list
     */
    private ListNode reverse(ListNode node) {
        if (node == null) {
            return null;
        }
        ListNode p1 = node, p2 = node.next, p3;
        p1.next = null;
        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }

    private void reorder(ListNode p, ListNode q) {
        ListNode p1 = p, p2;
        ListNode q1 = q, q2;
        while (p1 != null && q1 != null) {
            p2 = p1.next;
            q2 = q1.next;
            p1.next = q1;
            q1.next = p2;
            p1 = p2;
            q1 = q2;
        }
    }

}
