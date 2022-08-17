import struct.ListNode.ListNode;

public class Partition {

	public ListNode partition(ListNode head, int x) {
		ListNode small = new ListNode(0);
		ListNode great = new ListNode(0);
		ListNode s = small;
		ListNode g = great;
		while (head != null) {
			if (head.val < x) {
				small.next = head;
				small = small.next;
			} else {
				great.next = head;
				great = great.next;
			}
			head = head.next;
		}
		great.next = null;
		small.next = g.next;
		return s;
	}

}
