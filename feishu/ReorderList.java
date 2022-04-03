import struct.ListNode.ListNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author Zexho
 * @date 2022/4/3 4:42 PM
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        Deque<ListNode> queue = new ArrayDeque();
        ListNode node = head, next = null;
        while (node != null) {
            queue.offer(node);
            node = node.next;
        }

        node = queue.removeFirst();
        boolean flag = false;
        while (!queue.isEmpty()) {
            if (flag) {
                next = queue.removeFirst();
            } else {
                next = queue.removeLast();
            }
            node.next = next;
            node = node.next;
            node.next = null;
            flag = !flag;
        }
    }

}
