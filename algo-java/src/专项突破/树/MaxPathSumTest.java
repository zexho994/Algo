package 专项突破.树;

import org.junit.jupiter.api.Test;
import struct.TreeNode.TreeNode;

class MaxPathSumTest {

    @Test
    void maxPathSum() {
        MaxPathSum maxPathSum = new MaxPathSum();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-3);
        maxPathSum.maxPathSum(root);
    }
}