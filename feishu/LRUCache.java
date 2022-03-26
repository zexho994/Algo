import java.util.HashMap;
import java.util.Map;

/**
 * @author Zexho
 * @date 2022/3/25 9:10 PM
 */
public class LRUCache {

    private final Map<Integer, Node> cache;
    private final MyList list;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>(capacity);
        this.list = new MyList();
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        int val = cache.get(key).val;
        this.put(key, val);
        return val;
    }

    public void put(int key, int value) {
        Node node = new Node(key, value);

        if (this.cache.containsKey(key)) {
            node = cache.get(key);
            node.val = value;
            list.removeNode(node);
            list.addNode(node);
            return;
        }

        if (this.cache.size() == capacity) {
            Node t = list.removeTail();
            cache.remove(t.key);
        }
        cache.put(key, node);
        list.addNode(node);
    }

}

class MyList {
    Node head;
    Node tail;

    public MyList() {
        head = new Node(0, 0);
        tail = new Node(0, 0);
    }

    public void addNode(Node h) {
        head.next.pre = h;
        h.next = head.next;
        h.pre = head;
        head.next = h;
    }

    public void removeNode(Node n) {
        n.pre.next = n.next;
        n.next.pre = n.pre;
        n.pre = null;
        n.next = null;
    }

    public Node removeTail() {
        Node t = tail.pre;
        tail.pre = t.pre;
        return t;
    }

}

class Node {
    Node pre;
    Node next;
    int key;
    int val;

    public Node(int k, int v) {
        this.key = k;
        this.val = v;
    }
}
