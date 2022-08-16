package 专项突破.树.二叉搜索树;

import struct.TreeNode.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zexho
 * @date 2021/12/27 10:58 AM
 */
public class FindTarget {
    Set<Integer> set = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
            return false;
        }
        if (set.contains(k - root.val)) {
            return true;
        }
        set.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right, k);
    }

}
