package struct.ListNode;

/**
 * @Author: 994
 * @Date: 2020/6/26 10:11
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int v) {
        this.val = v;
    }

    public ListNode addNext(int... x) {
        ListNode head = this;
        this.val = x[0];
        for (int i = 1; i < x.length; i++) {
            head.next = new ListNode(x[i]);
            head = head.next;
        }
        return this;
    }
}
