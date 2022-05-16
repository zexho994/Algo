/**
 * @author : zexho
 * @created : 2022-05-16
**/
class AddTwoNumbers{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        while(l1 != null || l2 != null || carry == 1){
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
            int sum = (n1 + n2 + carry);
            ans.next = new ListNode(sum % 10);
            carry = sum / 10;
            ans = ans.next;
        }
        return dummy.next;
    }
}
