package leetcode.easy;

import struct.ListNode.ListNode;

import java.util.Stack;

/**
 * 234. 回文链表
 */
public class IsPalindromeLinked {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode node = head;
        int len = 0;
        while (node != null) {
            stack.push(node.val);
            node = node.next;
            len++;
        }
        node = head;
        len /= 2;
        int cur = 0;
        while (cur < len) {
            if(node.val != stack.pop()){
                return false;
            }
            cur++;
            len--;
            node = node.next;
        }
        return true;
    }
}
