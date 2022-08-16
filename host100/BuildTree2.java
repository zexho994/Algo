import struct.TreeNode.TreeNode;

/**
 * @author : zexho
 * @created : 2022-05-31
 **/
public class BuildTree2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int pl, int pr, int[] inorder, int il, int ir) {
        if (pl > pr || il > ir) return null;
        TreeNode node = new TreeNode(preorder[pl]);
        for (int i = il; i <= ir; i++) {
            if (inorder[i] == preorder[pl]) {
                int leftLen = i - il;
                node.left = build(preorder, pl + 1, pl + leftLen, inorder, il, i - 1);
                node.right = build(preorder, pl + 1 + leftLen, pr, inorder, i + 1, ir);
                break;
            }
        }
        return node;
    }
}
