package 专项突破.树;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2021/12/20 11:33 AM
 */
public class PathSum {
    int max;

    public int maxPathSum(TreeNode root) {
        max = root.val;
        dfs(root);
        return max;
    }

    /**
     * 从起始节点到当前节点为止，符合要求的路径数量
     *
     * @param node 当前节点
     * @return 当前节点可以得到的最大值
     */
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);

        max = Math.max(max, node.val + Math.max(left, 0) + Math.max(right, 0));
        return node.val + Math.max(Math.max(left, 0), Math.max(right, 0));
    }

}
