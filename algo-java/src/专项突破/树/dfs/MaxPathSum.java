package 专项突破.树.dfs;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2021/12/23 7:35 PM
 */
public class MaxPathSum {
    int max = 0;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    /**
     * 对于每个节点来说，max = 当前值 + 左右子节点的最大值.
     * 针对每个节点都进行这个判断，就可以获得所有节点下的最大值.
     * 注意点：
     *
     * @param node
     * @return
     */
    private int dfs(TreeNode node) {
        if (node == null) return 0;
        int left = dfs(node.left);
        int right = dfs(node.right);

        int res = node.val + Math.max(Math.max(left, 0), Math.max(right, 0));
        max = Math.max(max, res);
        return Math.max(res, 0);
    }
}
