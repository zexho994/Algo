package leetcode.easy;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2020/8/17 8:02 下午
 */
public class IsBalanced {

    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if(root == null){
            return 1;
        }
        int left = height(root.left);
        int right = height(root.right);

        if(left == -1 || right == -1 || Math.abs(left - right) > 1){
            return -1;
        }

        return Math.max(left,right) + 1;
    }
}
