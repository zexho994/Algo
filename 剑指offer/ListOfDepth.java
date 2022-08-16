import struct.ListNode.ListNode;
import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Zexho
 * @date 2022/3/9 6:49 PM
 */
public class ListOfDepth {

    public ListNode[] listOfDepth(TreeNode tree) {
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        List<ListNode> list = new ArrayList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode node = new ListNode();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                node.next = new ListNode(poll.val);
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            list.add(node);
        }
        ListNode[] ln = new ListNode[list.size()];
        return list.toArray(ln);
    }

}
