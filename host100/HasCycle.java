/**
 * @author : zexho
 * @created : 2022-06-19
**/
public class HasCycle{
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode slow = head,fast = head.next;
        while(slow != fast){
            if (fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
