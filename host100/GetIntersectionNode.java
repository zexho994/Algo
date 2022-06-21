/**
 * @author : zexho
 * @created : 2022-06-21
**/
public class GetIntersectionNode{
   public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0,lenB = 0;
        ListNode a = headA,b = headB;
        while(a != null || b != null){
            if(a != null) {
                lenA++;
                a = a.next;
            }
            if(b != null){
                lenB++;
                b = b.next;
            }
        }
        int diff = lenA-lenB;
        if (diff < 0){
            ListNode t = headA;
            headA = headB;
            headB = t;
            diff = -diff;
        }
        while(diff > 0){
            headA = headA.next;
            diff--;
        }
        while(headA != null && headB != null){
            if (headA == headB) return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
}
