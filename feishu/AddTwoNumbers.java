import struct.ListNode.ListNode;

/**
 * @author Zexho
 * @date 2022/3/28 10:39 PM
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode node = head;
        int add = 0, sum, n1 = 0, n2 = 0;
        while (l1 != null || l2 != null || add == 1) {
            if (l1 != null) {
                n1 = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                n2 = l2.val;
                l2 = l2.next;
            }
            sum = n1 + n2 + add;
            add = sum > 9 ? 1 : 0;
            node.next = new ListNode(sum % 10);
            node = node.next;
            n1 = 0;
            n2 = 0;
        }
        return head.next;
    }

}
