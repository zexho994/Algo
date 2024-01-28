import struct.ListNode;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeKLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }

        ListNode resultHead = new ListNode(0);
        ListNode resultNode = resultHead;

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);

        for(int i = 0; i < lists.length; i++){
            ListNode node = lists[i];
            if(node != null){
                priorityQueue.add(node);
            }
        }

        while (!priorityQueue.isEmpty()){
            resultNode.next = priorityQueue.poll();
            resultNode = resultNode.next;
            if(resultNode.next != null){
                priorityQueue.offer(resultNode.next);
            }
        }

        return resultHead.next;
    }

}
