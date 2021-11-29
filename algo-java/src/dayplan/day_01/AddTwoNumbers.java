package dayplan.day_01;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/29 9:13 下午
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode head = node;
        int inc = 0, sum = 0;
        while (l1 != null || l2 != null || inc == 1) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode((sum += inc) % 10);
            inc = sum > 9 ? 1 : 0;
            node = node.next;
            sum = 0;
        }
        return head.next;
    }
}
