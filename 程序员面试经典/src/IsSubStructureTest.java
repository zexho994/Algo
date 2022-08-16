import org.junit.jupiter.api.Test;
import struct.TreeNode.TreeNode;

class IsSubStructureTest {

    @Test
    void isSubStructure() {
        IsSubStructure isSubStructure = new IsSubStructure();

        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);
        A.left.right = new TreeNode(5);

        TreeNode B = new TreeNode(3);

        isSubStructure.isSubStructure(A, B);
    }
}