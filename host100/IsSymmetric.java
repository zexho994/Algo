import struct.TreeNode.TreeNode;

/**
 * @author : zexho
 * @created : 2022-06-05
**/
public class IsSymmetric{
    public boolean isSymmetric(TreeNode root) {
        return check(root.left,root.right);
    }

    public boolean check(TreeNode left,TreeNode right){
        if(left == right) return true;
        if(left == null || right == null) return false;
        if(left.val != right.val) return false;
        return check(left.left,right.right) & check(left.right,right.left);
    }
}
