package 专项突破.树;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2021/12/20 10:54 AM
 */
public class SumNumbers {

    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    /**
     * 从root到当前节点的和
     *
     * @return
     */
    public int sum(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return sum * 10 + node.val;
        }
        return sum(node.left, sum * 10 + node.val) + sum(node.right, sum * 10 + node.val);
    }
}
