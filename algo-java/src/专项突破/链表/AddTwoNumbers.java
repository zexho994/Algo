package 专项突破.链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/5 5:25 下午
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rl1 = reverse(l1);
        ListNode rl2 = reverse(l2);
        ListNode node = new ListNode(0);
        ListNode head = node;
        int acc = 0;
        while (rl1 != null && rl2 != null) {
            int sum = rl1.val + rl2.val + acc;
            acc = sum > 9 ? 1 : 0;
            node.next = new ListNode(sum % 10);
            node = node.next;
            rl1 = rl1.next;
            rl2 = rl2.next;
        }
        rl1 = rl1 != null ? rl1 : rl2;
        while (rl1 != null) {
            int sum = rl1.val + acc;
            acc = sum > 9 ? 1 : 0;
            node.next = new ListNode(sum % 10);
            node = node.next;
            rl1 = rl1.next;
        }
        if (acc == 1) {
            node.next = new ListNode(1);
        }
        return reverse(head.next);
    }

    public ListNode reverse(ListNode head) {
        ListNode p1 = head, p2 = head.next, p3;
        p1.next = null;
        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        return p1;
    }
}
