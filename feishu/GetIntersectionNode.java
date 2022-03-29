import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/3/29 10:39 PM
 */
public class GetIntersectionNode {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = this.getLength(headA);
        int lenB = this.getLength(headB);

        int diff = lenA - lenB;
        while (diff > 0) {
            headA = headA.next;
            diff--;
        }
        while (diff < 0) {
            headB = headB.next;
            diff++;
        }
        while (headA != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int getLength(ListNode node) {
        int len = 1;
        while (node != null) {
            len++;
            node = node.next;
        }
        return len;
    }
}
