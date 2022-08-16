package 链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/2/19 10:34 PM
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0, lenB = 0;
        ListNode a = headA, b = headB;
        while (a != null) {
            a = a.next;
            lenA++;
        }
        while (b != null) {
            b = b.next;
            lenB++;
        }
        if (lenA > lenB) {
            a = headB;
            b = headA;
        } else {
            a = headA;
            b = headB;
        }
        int l = lenA > lenB ? lenA - lenB : lenB - lenA;
        while (l > 0) {
            a = a.next;
            l--;
        }
        while (a != null) {
            if (a == b) {
                return a;
            }
            a = a.next;
            b = b.next;
        }
        return null;
    }
}
