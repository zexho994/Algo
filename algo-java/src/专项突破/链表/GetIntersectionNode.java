package 专项突破.链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/5 4:41 下午
 */
public class GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int diff = getLen(headA) - getLen(headB);
        ListNode pa = diff > 0 ? move(headA, diff) : headA;
        ListNode pb = diff < 0 ? move(headB, diff) : headB;
        while (pa != pb) {
            pa = pa.next;
            pb = pb.next;
        }
        return pa;
    }

    public int getLen(ListNode node) {
        int count = 1;
        while (node != null) {
            node = node.next;
            count++;
        }
        return count;
    }

    public ListNode move(ListNode node, int n) {
        while (n != 0) {
            n--;
            node = node.next;
        }
        return node;
    }
}
