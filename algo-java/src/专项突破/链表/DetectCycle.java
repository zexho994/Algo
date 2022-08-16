package 专项突破.链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/5 3:46 下午
 */
public class DetectCycle {
    public ListNode detectCycle(ListNode head) {
        //1. 判断有无环
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }

        // 获取环的入口
        slow = head;
        while (slow != fast) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow;
    }
}
