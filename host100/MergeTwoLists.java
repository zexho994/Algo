import struct.ListNode.ListNode;

/**
 * @author : zexho
 * @created : 2022-05-19
**/
public class MergeTwoLists{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode h = dummy;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                h.next = list1;
                list1 = list1.next;
            }else{
                h.next = list2;
                list2 = list2.next;
            }
            h = h.next;
        }
        if(list1 != null) h.next = list1;
        if(list2 != null) h.next = list2;
        return dummy.next;
    }
}
