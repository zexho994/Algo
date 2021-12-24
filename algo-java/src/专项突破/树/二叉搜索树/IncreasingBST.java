package 专项突破.树.二叉搜索树;

import struct.TreeNode.TreeNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Zexho
 * @date 2021/12/23 8:12 PM
 */
public class IncreasingBST {
    Queue<TreeNode> queue = new LinkedBlockingQueue<>();

    public TreeNode increasingBST(TreeNode root) {
        dfs(root);
        TreeNode h = queue.peek();
        while (true) {
            TreeNode poll = queue.poll();
            poll.left = null;
            if (!queue.isEmpty()) {
                poll.right = queue.peek();
            } else {
                break;
            }
        }
        return h;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;
        dfs(node.left);
        queue.offer(node);
        dfs(node.right);
    }
}
