import struct.TreeNode.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author Zexho
 * @date 2022/3/5 10:15 AM
 */
public class LevelOrder2 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int s = queue.size();
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < s; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null) queue.offer(treeNode.left);
                if (treeNode.right != null) queue.offer(treeNode.right);
                if (res.size() % 2 == 0) sub.add(treeNode.val);
                else sub.add(0, treeNode.val);
            }
            res.add(sub);
        }
        return res;
    }

}
