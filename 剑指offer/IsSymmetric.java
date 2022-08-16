import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2022/3/4 10:47 AM
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return compare(root.left, root.right);
    }

    private boolean compare(TreeNode a, TreeNode b) {
        if (a == b) {
            return true;
        }
        if (a == null || b == null || a.val != b.val) {
            return false;
        }
        return compare(a.left, b.right) && compare(a.right, b.left);
    }
}
