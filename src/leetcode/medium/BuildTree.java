package leetcode.medium;

import struct.TreeNode.TreeNode;

import java.util.Arrays;

public class BuildTree {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length <= 0){
            return null;
        }
        // 后续遍历数组总长度
        int length = postorder.length;
        // 根结点值
        int rootVal = postorder[length-1];
        TreeNode root = new TreeNode(rootVal);

        // 找到中序数组中根节点位置
        int idx = 0;
        for(int in : inorder){
            if(in == rootVal){
                break;
            }
            idx++;
        }

        int[] newInorderLeft = Arrays.copyOfRange(inorder,0,idx);
        int[] newInorderRight = Arrays.copyOfRange(inorder,idx+1,length);

        int[] newPostorderLeft = Arrays.copyOfRange(postorder,0,newInorderLeft.length);
        int[] newPostorderRight = Arrays.copyOfRange(postorder,newInorderLeft.length,postorder.length-1);

        root.left = buildTree(newInorderLeft,newPostorderLeft);
        root.right = buildTree(newInorderRight,newPostorderRight);

        return root;
    }
}
