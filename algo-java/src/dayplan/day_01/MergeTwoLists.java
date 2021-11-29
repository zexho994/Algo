package dayplan.day_01;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/29 9:06 下午
 */
public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode head = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                listNode.next = l2;
                l2 = l2.next;
            } else {
                listNode.next = l1;
                l1 = l1.next;
            }
            listNode = listNode.next;
        }
        if (l1 != null) {
            listNode.next = l1;
        } else if (l2 != null) {
            listNode.next = l2;
        }

        return head.next;
    }
}
