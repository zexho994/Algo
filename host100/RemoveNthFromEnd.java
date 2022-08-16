/**
 * @author : zexho
 * @created : 2022-05-19
**/
public class RemoveNthFromEnd{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        for(int i = 0; fast != null && i < n; i++){
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
