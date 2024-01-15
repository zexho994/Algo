import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import struct.ListNode;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode first = new ListNode(-1);
        ListNode preTail = first;
        preTail.next = head;
        while (preTail.next != null) {
            ListNode h = preTail.next;
            ListNode tail = preTail.next;
            int len = 1;
            for (int i = 1; i < k && tail.next != null; i++) {
                len++;
                tail = tail.next;
            }
            if(len < k){
                break;
            }
            ListNode nextHead = tail.next;
            tail.next = null;
            reverseSubList(preTail.next);
            preTail.next = tail;
            h.next = nextHead;
            preTail = h;
        }

        return first.next;
    }


    public void reverseSubList(ListNode head) {
        ListNode p1 = null, p2 = head, p3 = null;
        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
    }


    @Nested
    class ReverseKGroupTest {
        ReverseKGroup reverseKGroup = new ReverseKGroup();

        @Test
        public void testReverseKGroup() {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode expectedResult = new ListNode(2);
            expectedResult.next = new ListNode(1);
            expectedResult.next.next = new ListNode(4);
            expectedResult.next.next.next = new ListNode(3);
            expectedResult.next.next.next.next = new ListNode(5);

            ListNode result = reverseKGroup.reverseKGroup(head, 2);

            assertEquals(new int[]{2,1,4,3,5}, result);
        }

        @Test
        public void testReverseSubList() {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);

            ListNode expectedResult = new ListNode(2);
            expectedResult.next = new ListNode(1);
            expectedResult.next.next = new ListNode(4);
            expectedResult.next.next.next = new ListNode(3);

            reverseKGroup.reverseSubList(head);

            assertEquals(expectedResult, head);
        }

        @Test
        public void testReverseKGroup_kEqualTo1() {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode expectedResult = new ListNode(1);
            expectedResult.next = new ListNode(2);
            expectedResult.next.next = new ListNode(3);
            expectedResult.next.next.next = new ListNode(4);
            expectedResult.next.next.next.next = new ListNode(5);

            ListNode result = reverseKGroup.reverseKGroup(head, 1);

            assertEquals(expectedResult, result);
        }

        @Test
        public void testReverseKGroup_kEqualToLengthOfList() {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode expectedResult = new ListNode(5);
            expectedResult.next = new ListNode(4);
            expectedResult.next.next = new ListNode(3);
            expectedResult.next.next.next = new ListNode(2);
            expectedResult.next.next.next.next = new ListNode(1);

            ListNode result = reverseKGroup.reverseKGroup(head, 5);

            assertEquals(expectedResult, result);
        }

        @Test
        public void testReverseKGroup_kGreaterThanLengthOfList() {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode expectedResult = new ListNode(5);
            expectedResult.next = new ListNode(4);
            expectedResult.next.next = new ListNode(3);
            expectedResult.next.next.next = new ListNode(2);
            expectedResult.next.next.next.next = new ListNode(1);

            ListNode result = reverseKGroup.reverseKGroup(head, 6);

            assertEquals(expectedResult, result);
        }

        @Test
        public void testReverseKGroup_kSmallerThanLengthOfList() {
            ListNode head = new ListNode(1);
            head.next = new ListNode(2);
            head.next.next = new ListNode(3);
            head.next.next.next = new ListNode(4);
            head.next.next.next.next = new ListNode(5);

            ListNode expectedResult = new ListNode(1);
            expectedResult.next = new ListNode(3);
            expectedResult.next.next = new ListNode(2);
            expectedResult.next.next.next = new ListNode(4);
            expectedResult.next.next.next.next = new ListNode(5);

            ListNode result = reverseKGroup.reverseKGroup(head, 2);

            assertEquals(expectedResult, result);
        }

        @Test
        public void testReverseKGroup_emptyList() {
            ListNode head = null;

            ListNode expectedResult = null;

            ListNode result = reverseKGroup.reverseKGroup(head, 2);

            assertEquals(expectedResult, result);
        }

        @Test
        public void testReverseKGroup_listWithOnlyOneElement() {
            ListNode head = new ListNode(1);

            ListNode expectedResult = new ListNode(1);

            ListNode result = reverseKGroup.reverseKGroup(head, 2);

            assertEquals(expectedResult, result);
        }
    }


}
