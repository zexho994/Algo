package 链表;

import struct.ListNode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/2/18 6:40 PM
 */
public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
