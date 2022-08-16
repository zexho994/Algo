import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/3/2 12:31 PM
 */
public class DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        ListNode h = new ListNode();
        h.next = head;
        ListNode p = h;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
                break;
            }
            p = p.next;
        }
        return h.next;
    }
}
