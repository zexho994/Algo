import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Zexho
 * @date 2022/3/5 10:03 AM
 */
public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> sub = new ArrayList<>();
            int s = queue.size();
            for (int i = 0; i < s; i++) {
                TreeNode poll = queue.poll();
                sub.add(poll.val);
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            res.add(sub);
        }
        return res;
    }

}
