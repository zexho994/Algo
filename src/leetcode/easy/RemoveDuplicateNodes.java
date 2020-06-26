package leetcode.easy;

import struct.ListNode.ListNode;

import java.util.HashSet;

/**
 * 面试题 02.01. 移除重复节点
 * @Author: 994
 * @Date: 2020/6/26 10:10
 */
public class RemoveDuplicateNodes {
    public ListNode removeDuplicateNodes(ListNode head){
        if(head == null){
            return null;
        }
        HashSet set = new HashSet();
        set.add(head.val);
        ListNode r = head;
        while (head.next != null){
            if(!set.add(head.next.val)){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return r;
    }

}
