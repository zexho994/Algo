public class InorderSuccessor {
    TreeNode node = null;

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || node != null) return node;

        if (p.val < root.val) {
            inorderSuccessor(root.left, p);
        }
        if (node == null && root.val > p.val) {
            node = root;
        } else {
            inorderSuccessor(root.right, p);
        }
        return node;
    }
}
