/**
 * @author : zexho
 * @created : 2022-06-11
**/
public class MaxPathSum{
    private int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        path(root);
        return max;
    }

    private int path(TreeNode node){
        if(node == null) return 0;
        int left = path(node.left);
        int right = path(node.right);
        int sum = (left > 0 ? left : 0) + node.val + (right > 0 ? right : 0);
        max = Math.max(max,sum);
        return node.val + Math.max(0, Math.max(left, right));
    }
}
