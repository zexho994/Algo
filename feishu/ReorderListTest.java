import struct.ListNode.ListNode;

class ReorderListTest {

    public static void main(String[] args) {
        ReorderList reorderList = new ReorderList();
        ListNode listNode = new ListNode(1);
        listNode.addNext(1,2,3,4);
        reorderList.reorderList(listNode);

        ListNode listNode2 = new ListNode();
        listNode2.addNext(1,2,3,4,5);
        reorderList.reorderList(listNode2);

        ListNode listNode3 = new ListNode();
        listNode3.addNext(1);
        reorderList.reorderList(listNode3);
    }

}