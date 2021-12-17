package 专项突破.队列;

import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Zexho
 * @date 2021/12/17 11:25 AM
 */
public class LargestValues {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxList = new ArrayList<>();
        if(root == null){
            return maxList;
        }
        Queue<TreeNode> readQueue = new LinkedBlockingQueue<>();
        Queue<TreeNode> writeQueue = new LinkedBlockingQueue<>();
        readQueue.offer(root);
        while (!readQueue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            while (!readQueue.isEmpty()) {
                TreeNode poll = readQueue.poll();
                if (poll == null) {
                    continue;
                }
                max = Math.max(poll.val, max);
                if (poll.left != null) {
                    writeQueue.offer(poll.left);
                }
                if (poll.right != null) {
                    writeQueue.offer(poll.right);
                }
            }
            maxList.add(max);
            readQueue = writeQueue;
            writeQueue = new LinkedBlockingQueue<>();
        }
        return maxList;
    }
}
