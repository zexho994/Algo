import struct.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortList {
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> queue  = new PriorityQueue<>(
                (o1, o2) -> o1.val - o2.val
        );

        return null;
    }
}
