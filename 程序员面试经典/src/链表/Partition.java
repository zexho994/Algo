package 链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/2/18 4:25 PM
 */
public class Partition {
    public ListNode partition(ListNode head, int x) {
        ListNode temp1 = new ListNode();
        ListNode temp2 = new ListNode();
        ListNode h1 = temp1, h2 = temp2;
        while (head != null) {
            if (head.val < x) {
                temp1.next = head;
                temp1 = temp1.next;
            } else {
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
        }
        temp1.next = h2.next;
        return h1.next;
    }
}
