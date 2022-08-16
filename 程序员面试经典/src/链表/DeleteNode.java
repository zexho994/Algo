package 链表;

import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/2/18 4:11 PM
 */
public class DeleteNode {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
