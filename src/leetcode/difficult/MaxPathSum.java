package leetcode.difficult;

/**
 * @Author: 994
 * @Date: 2020/6/21 13:24
 */
public class MaxPathSum {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
     }

     /**
     * 全局变量,记录最大路径和
     */
    private int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
           getMax(root);
           return maxSum;
    }
    private int getMax(TreeNode root){
        if(root == null){
            return 0;
        }
        int l = Math.max(getMax(root.left),0);
        int r = Math.max(getMax(root.right),0);
        maxSum = Math.max(maxSum,l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}
