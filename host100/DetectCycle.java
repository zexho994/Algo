/**
 * @author : zexho
 * @created : 2022-06-20
**/
public class DetectCycle{
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode fast = head.next.next, slow = head.next;
        while(fast != slow){
            if(fast == null || fast.next == null) return null;
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = head;
        int step = 0;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
            step++;
        }
        return slow;
    }
}
