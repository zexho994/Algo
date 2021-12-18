package 专项突破.树;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2021/12/18 12:55 PM
 */
public class PruneTree {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root.left == null && root.right == null && root.val == 0 ? null : root;
    }
}
