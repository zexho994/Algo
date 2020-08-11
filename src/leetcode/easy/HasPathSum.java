package leetcode.easy;

import struct.TreeNode.TreeNode;

/**
 * 112. 路径总和
 * @Author: 994
 * @Date: 2020/7/7 12:49
 */
public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null || root.val > sum){
            return false;
        }
        if(root.val == sum){
            return true;
        }
        
        sum = sum - root.val;
        return hasPathSum(root.left,sum) || hasPathSum(root.right,sum);
    }

}
