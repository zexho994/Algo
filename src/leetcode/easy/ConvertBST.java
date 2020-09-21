package leetcode.easy;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @created 2020/9/21 8:32 上午
 */
public class ConvertBST {
    public TreeNode convertBST(TreeNode root){
        int sum = 0;
        while(root != null){
            convertBST(root.right);
            sum += root.val;
            root.val += sum;
            convertBST(root.left);
        }
        return root;
    }
}
