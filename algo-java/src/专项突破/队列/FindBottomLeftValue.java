package 专项突破.队列;

import struct.TreeNode.TreeNode;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Zexho
 * @date 2021/12/17 2:26 PM
 */
public class FindBottomLeftValue {

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> readQueue = new LinkedBlockingQueue<>();
        Queue<TreeNode> writeQueue = new LinkedBlockingQueue<>();
        readQueue.offer(root);
        int h = root.val;
        while (true) {
            TreeNode poll = readQueue.poll();
            if (poll.left != null) writeQueue.offer(poll.left);
            if (poll.right != null) writeQueue.offer(poll.right);
            if (readQueue.isEmpty()) {
                if (writeQueue.isEmpty()) break;
                h = writeQueue.peek().val;
                readQueue = writeQueue;
                writeQueue = new LinkedBlockingQueue<>();
            }
        }
        return h;
    }

}
