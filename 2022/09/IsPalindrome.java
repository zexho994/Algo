public class IsPalindrome {

    /**
     * 解法1：通过数组记录链表数据，然后双指针判断
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            len++;
        }
        int[] arr = new int[len];
        p = head;
        int l = 0;
        while (p != null) {
            arr[l++] = p.val;
            p = p.next;
        }
        l = 0;
        int r = len - 1;
        while (l < r) {
            if (arr[l++] != arr[r--]) {
                return false;
            }
        }
        return true;
    }


    /**
     * 反转后半部分链表
     *
     * @param head
     * @return
     */
    public boolean isPalindrome2(ListNode head) {
        ListNode p = head;
        int len = 0;
        while (p != null) {
            p = p.next;
            len++;
        }
        p = head;
        int end = (len/2)-1;
        for (int i = 0; i < end; i++) {
            p = p.next;
        }
        ListNode s = p.next;
        reverse(s);
        s = p.next;
        while(p != null){
            if(p.val != s.val){
                return false;
            }
            p = p.next;
            s = s.next;
        }
        return true;
    }

    public void reverse(ListNode node){
        ListNode p1 = null;
        ListNode p2 = node;
        ListNode p3 = null;
        while(p2 != null){
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
    }
}
