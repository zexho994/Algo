package 专项突破.队列;

import struct.TreeNode.TreeNode;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Zexho
 * @date 2021/12/17 10:11 AM
 */
public class CBTInserter {

    TreeNode root;
    Queue<TreeNode> queue;

    public CBTInserter(TreeNode root) {
        this.root = root;
        queue = new ArrayBlockingQueue<>(2500);
        queue.offer(root);
        while (queue.peek().left != null) {
            queue.offer(queue.peek().left);
            if (queue.peek().right != null) {
                TreeNode poll = queue.poll();
                queue.offer(poll.right);
            } else {
                break;
            }
        }
    }

    public int insert(int v) {
        TreeNode node = new TreeNode(v);
        queue.offer(node);
        if (queue.peek().left == null) {
            queue.peek().left = node;
            return queue.peek().val;
        } else {
            TreeNode poll = queue.poll();
            poll.right = node;
            return poll.val;
        }
    }

    public TreeNode get_root() {
        return this.root;
    }

}
