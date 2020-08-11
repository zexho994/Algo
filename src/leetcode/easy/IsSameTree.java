package leetcode.easy;

import struct.TreeNode.TreeNode;

import java.util.Stack;

/**
 * @description: 100. 相同的数
 * @author: zexho
 * @created: 2020/08/07 08:26
 */
public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return dp(p,q);
    }

    public boolean dp(TreeNode p,TreeNode q){
        if(p == null || q == null){
            if(q != null || p != null){
                return false;
            }
            return true;
        }
        if(p.val != q.val){
            return false;
        }
        if(dp(p.left,q.left)){
            return dp(p.right,q.right);
        }
        return false;
    }



}
