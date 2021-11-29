package dayplan.day_01;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2021/11/29 9:24 下午
 */
public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return new ListNode().next;
        }
        ListNode node = new ListNode(0);
        node.next = lists[0];
        for (int i = 1; i < lists.length; i++) {
            ListNode tmp = lists[i];
            ListNode p = node;
            while (tmp != null) {
                if (p.next == null) {
                    p.next = tmp;
                    tmp = null;
                } else if (p.next.val > tmp.val) {
                    ListNode t = p.next;
                    p.next = tmp;
                    tmp = tmp.next;
                    p.next.next = t;
                }
                p = p.next;
            }
        }
        return node.next;
    }
}
