public class DeleteNode {
    public void deleteNode(ListNode node) {
        ListNode t = node;
        while (true) {
            t.val = t.next.val;
            if (t.next.next == null) {
                t.next = null;
                break;
            }
            t = t.next;
        }
    }
}
