public class InorderSuccessor {
    TreeNode node = null;

    /**
     * 通过递归的方式遍历
     *
     * @param root
     * @param p
     * @return
     */
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

    /**
     * 通过迭代的方式遍历
     *
     * @param root
     * @param p
     * @return
     */
    public TreeNode inorderSuccessor2(TreeNode root, TreeNode p) {
        TreeNode cur = root;
        TreeNode succ = null;
        while (cur != null) {
            if (p.val < cur.val) {
                succ = cur;
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return succ;
    }
}
