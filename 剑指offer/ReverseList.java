import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/3/4 8:41 AM
 */
public class ReverseList {

    // 1 - 2 - 3 - 4 - nil
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
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
