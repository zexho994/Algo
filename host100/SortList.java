/**
 * @author : zexho
 * @created : 2022-05-31
**/
public class SortList{
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        fast = sortList(slow.next);
        slow.next = null;
        slow = sortList(head);

        ListNode dummy = new ListNode();
        ListNode h = dummy;
        while(fast != null && slow != null){
            if(fast.val <= slow.val){
                h.next = fast;
                fast = fast.next;
            }else {
                h.next = slow;
                slow = slow.next;
            }
            h = h.next;
        }
        if(slow != null) fast = slow;
        while(fast != null){
            h.next = fast;
            fast = fast.next;
            h = h.next;
        }
        return dummy.next;
    }

}
