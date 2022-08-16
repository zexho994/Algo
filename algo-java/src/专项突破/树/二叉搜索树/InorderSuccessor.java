package 专项突破.树.二叉搜索树;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2021/12/24 2:53 PM
 */
public class InorderSuccessor {

    TreeNode pre = null;
    boolean flag;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null) {
            return null;
        }
        if (!flag) {
            inorderSuccessor(root.left, p);
        }
        if (!flag) {
            if (pre != null && pre.val >= p.val) {
                flag = true;
            }
            pre = root;
            inorderSuccessor(root.right, p);
        }
        return flag ? pre : null;
    }
}
