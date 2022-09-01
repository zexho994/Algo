public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        return vaild(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean vaild(TreeNode node, long min, long max) {
        if (node == null) return true;
        if (node.val <= min || node.val >= max) {
            return false;
        }
        return vaild(node.left, min, node.val) && vaild(node.right, node.val, max);
    }
}
