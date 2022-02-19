package 链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/2/18 5:34 PM
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode h = res;
        int add = 0, n;
        while (l1 != null && l2 != null) {
            add = (n = l1.val + l2.val + add) > 9 ? 1 : 0;
            res.next = new ListNode(n % 10);
            res = res.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            add = (n = l1.val + add) > 9 ? 1 : 0;
            res.next = new ListNode(n % 10);
            res = res.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            add = (n = l2.val + add) > 9 ? 1 : 0;
            res.next = new ListNode(n % 10);
            res = res.next;
            l2 = l2.next;
        }
        if (add == 1) {
            res.next = new ListNode(1);
        }
        return h.next;
    }
}
