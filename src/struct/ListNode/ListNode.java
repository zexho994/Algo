package struct.ListNode;

/**
 * @Author: 994
 * @Date: 2020/6/26 10:11
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(){}
    public ListNode(int v){
        this.val = v;
    }

    public ListNode addNext(int x){
        this.next = new ListNode(x);
        return this.next;
    }
}
