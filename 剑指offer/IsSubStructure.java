import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2022/3/4 9:10 AM
 */
public class IsSubStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null) return false;
        return isSub(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    public boolean isSub(TreeNode A, TreeNode B) {
        if (A == B || B == null) return true;
        else if (A == null || A.val != B.val) return false;
        return isSub(A.left, B.left) && isSub(A.right, B.right);
    }

}
