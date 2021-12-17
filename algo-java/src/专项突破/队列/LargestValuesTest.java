package 专项突破.队列;

import org.junit.jupiter.api.Test;
import struct.TreeNode.TreeNode;

import static org.junit.jupiter.api.Assertions.*;

class LargestValuesTest {

    @Test
    void largestValues() {
        LargestValues largestValues = new LargestValues();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        largestValues.largestValues(root);
    }
}