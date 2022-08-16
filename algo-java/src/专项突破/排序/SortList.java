package 专项突破.排序;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/12/10 11:17 上午
 */
public class SortList {
    // 拆分
    // 排序
    // 合并
    public void ListNode(ListNode head) {
        sort(head);
    }

    public ListNode sort(ListNode node) {
        ListNode fast = node;
        ListNode slow = node;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode h = slow.next;
        slow.next = null;

        ListNode h1 = sort(node);
        ListNode h2 = sort(h);
        node = merge(h1, h2);
        return node;
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode t = new ListNode();
        ListNode h = t;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                t.next = l2;
                l2 = l2.next;
            } else {
                t.next = l1;
                l1 = l1.next;
            }
            t = t.next;
        }
        while (l1 != null) {
            t.next = l1;
            l1 = l1.next;
            t = t.next;
        }
        while (l2 != null) {
            t.next = l2;
            l2 = l2.next;
            t = t.next;
        }
        return h.next;
    }
}
