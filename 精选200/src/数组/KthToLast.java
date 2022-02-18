package 数组;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/2/18 4:05 PM
 */
public class KthToLast {
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
