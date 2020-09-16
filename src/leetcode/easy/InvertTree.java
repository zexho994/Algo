package leetcode.easy;

import struct.TreeNode.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        dp(root);
        return root;
    }

    public void dp(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        dp(root.left);
        dp(root.right);
    }


}
