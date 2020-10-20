package leetcode.medium;

import struct.ListNode.ListNode;

import java.util.Stack;

public class ReorderList {
    public void reorderList(ListNode head) {
        int len = 1;
        ListNode node = head;
        // 确定链表长度
        while(node.next != null){
            len++;
            node = node.next;
        }

        // 确定中间点
        int clen = (len+1)/2 - 1;
        int mid = len - clen;
        Stack<ListNode> stack = new Stack<>();
        int idx = 1;
        node = head;
        while(idx < mid){
            idx++;
            node = node.next;
        }

        ListNode tmp = node;
        // 装载node
        while(node.next != null){
            stack.push(node.next);
            node = node.next;
            tmp.next = null;
            tmp = node;
        }

        node = head;
        while(!stack.isEmpty()){
            ListNode pop = stack.pop();
            pop.next = node.next;
            node.next = pop;
            node = pop.next;
        }
    }

    public static void main(String[] args) {
        ListNode root = new ListNode(1);
        ListNode head = root;
        root = root.addNext(2);
        root = root.addNext(3);
        root = root.addNext(4);
        root = root.addNext(5);
        root = root.addNext(6);
        ReorderList reorderList = new ReorderList();
        reorderList.reorderList(head);

    }
}
