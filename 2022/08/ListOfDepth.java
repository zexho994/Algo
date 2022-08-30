import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepth {
    public ListNode[] listOfDepth(TreeNode tree) {
        List<ListNode> ans = new ArrayList<ListNode>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(tree);
        while (!queue.isEmpty()) {
            int size = queue.size();
            ListNode h = new ListNode(0);
            ListNode p = h;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                p.next = new ListNode(poll.val);
                p = p.next;
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            ans.add(h.next);
        }

        ListNode[] ansArr = new ListNode[ans.size()];
        int idx = 0;
        for(ListNode l : ans){
            ansArr[idx++] = l;
        }
        return ansArr;
    }

}
