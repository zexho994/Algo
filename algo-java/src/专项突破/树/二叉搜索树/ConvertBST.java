package 专项突破.树.二叉搜索树;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2021/12/27 10:45 AM
 */
public class ConvertBST {
    int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        convertBST(root.right);
        sum += root.val;
        root.val = sum;
        convertBST(root.left);
        return root;
    }
}
