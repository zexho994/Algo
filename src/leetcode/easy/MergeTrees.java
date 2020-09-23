package leetcode.easy;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @created 2020/9/23 8:20 上午
 */
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return dp(t1,t2);
    }

    public TreeNode dp(TreeNode t1,TreeNode t2){
        if(t1 == null && t2 == null){
            return null;
        }

        TreeNode tree = new TreeNode((t1 == null ? 0 : t1.val )+( t2 == null ?0 : t2.val));
        tree.left = dp(t1 == null ? null : t1.left,t2 == null ? null : t2.left);
        tree.right = dp(t1 == null ? null : t1.right,t2 == null ? null : t2.right);

        return tree;
    }
}
