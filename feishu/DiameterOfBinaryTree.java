import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2022/3/31 8:44 AM
 */
public class DiameterOfBinaryTree {
    private int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        return Math.max(process(root), max);
    }

    private int process(TreeNode node) {
        int curLen = 0;
        int left = 0, right = 0;
        if (node.left != null) {
            left = process(node.left) + 1;
        }
        if (node.right != null) {
            right = process(node.right) + 1;
        }
        curLen += left + right;
        max = Math.max(max, curLen);
        return Math.max(left, right);
    }

}
