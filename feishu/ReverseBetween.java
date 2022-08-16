import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/3/26 7:10 PM
 */
public class ReverseBetween {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 1. 找到头、尾
        ListNode h = head;
        ListNode tempHead = null;
        if (left > 1) {
            for (int i = 1; i < left - 1; i++) {
                h = h.next;
            }
            tempHead = h;
            h = h.next;
        }
        ListNode t = h;
        for (int i = left; i < right; i++) {
            t = t.next;
        }
        ListNode tmpTail = t.next;
        t.next = null;

        // 2.翻转
        ListNode n1 = null;
        ListNode n2 = h;
        ListNode n3;
        while (n2 != null) {
            n3 = n2.next;
            n2.next = n1;
            n1 = n2;
            n2 = n3;
        }

        // 3.连接
        if (left > 1) tempHead.next = t;
        h.next = tmpTail;
        return head;
    }

}
