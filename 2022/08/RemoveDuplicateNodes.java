import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode h = head, pre = null, cur = head;
        while (cur != null) {
            if (set.add(cur.val)) {
                pre = cur;
                cur = cur.next;
            } else {
                pre.next = cur.next;
                cur = cur.next;
            }
        }
        return h;
    }
}
