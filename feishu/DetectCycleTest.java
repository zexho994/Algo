import org.junit.jupiter.api.Test;
import struct.ListNode.ListNode;

class DetectCycleTest {

    @Test
    void detectCycle() {
        ListNode listNode = new ListNode(3);
        ListNode h = listNode;
        listNode.next = new ListNode(2);
        listNode = listNode.next;
        ListNode temp = listNode;
        listNode.next = new ListNode(0);
        listNode = listNode.next;
        listNode.next = new ListNode(-4);
        listNode = listNode.next;
        listNode.next = temp;

        DetectCycle detectCycle = new DetectCycle();
        detectCycle.detectCycle(h);
    }
}