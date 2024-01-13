import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    private final Map<Integer, ListNode> map;
    private final LinkedList linkedList;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.linkedList = new LinkedList();
    }


    static class LinkedList {
        private ListNode head, tail;
        private int size = 0;

        public LinkedList() {
            head = new ListNode(-1, -1);
            tail = new ListNode(-1, -1);
            head.next = tail;
            tail.pre = head;
        }

        public void used(ListNode node) {
            remove(node);
            addLast(node);
        }

        public void remove(ListNode removedNode){
            removedNode.pre.next = removedNode.next;
            removedNode.next.pre = removedNode.pre;
            removedNode.pre = null;
            removedNode.next = null;
            size--;
        }

        public ListNode removeFirst() {
            if (size == 0) {
                throw new RuntimeException("size is zero!");
            }

            ListNode removedNode = head.next;
            remove(removedNode);
            return removedNode;
        }

        public void addLast(ListNode newNode) {
            tail.pre.next = newNode;
            newNode.pre = tail.pre;
            newNode.next = tail;
            tail.pre = newNode;
            size++;
        }

    }

    static class ListNode {
        public int key, value;
        public ListNode pre, next;

        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }


    public int get(int key) {
        ListNode node = map.get(key);
        if (node == null) {
            return -1;
        }

        linkedList.used(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            ListNode node = map.get(key);
            linkedList.used(node);
            node.value = value;
        } else {
            ListNode newNode = new ListNode(key, value);
            map.put(key, newNode);
            linkedList.addLast(newNode);
        }

        //处理
        if (linkedList.size > capacity) {
            ListNode removedNode = linkedList.removeFirst();
            map.remove(removedNode.key);
        }

    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
