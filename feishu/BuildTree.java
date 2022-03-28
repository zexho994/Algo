import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2022/3/28 11:29 PM
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, inorder, 0, 0, preorder.length - 1);
    }

    private TreeNode build(int[] pre, int[] in, int pl, int left, int right) {
        if (left > right || pl == pre.length) {
            return null;
        }
        int mid = left;
        while (in[mid] != pre[pl]) {
            mid++;
        }
        TreeNode node = new TreeNode(mid);
        node.left = build(pre, in, pl + 1, left, mid - 1);
        node.right = build(pre, in, pl + (mid - left), mid + 1, right);
        return node;
    }

}
