package 专项突破.树;

import struct.TreeNode.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zexho
 * @date 2021/12/20 11:33 AM
 */
public class PathSum {

    Set<TreeNode> set = new HashSet<>();

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        set.add(root);
        return dfs(root, 0, targetSum);
    }

    /**
     * 从起始节点到当前节点为止，符合要求的路径数量
     *
     * @param node      当前节点
     * @param pre       起始节点到当前节点之前的路径和
     * @param targetSum 目标值
     * @return
     */
    private int dfs(TreeNode node, int pre, int targetSum) {
        if (node == null) return 0;
        int count = 0;
        if (pre + node.val == targetSum) count++;

        if (!set.contains(node)) {
            set.add(node);
            if (node.val == targetSum) {
                count++;
            }
            count += dfs(node.left, node.val, targetSum);
            count += dfs(node.right, node.val, targetSum);
        }

        count += dfs(node.left, pre + node.val, targetSum);
        count += dfs(node.right, pre + node.val, targetSum);
        return count;
    }

}
