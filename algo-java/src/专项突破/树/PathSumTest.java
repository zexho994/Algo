package 专项突破.树;

import org.junit.jupiter.api.Test;
import struct.TreeNode.TreeNode;

class PathSumTest {

    @Test
    void pathSum() {
        TreeNode root = new TreeNode(10);
        TreeNode node = root;
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-3);

        PathSum pathSum = new PathSum();
        int res = pathSum.pathSum(root, 7);
        assert res == 2;
    }
}