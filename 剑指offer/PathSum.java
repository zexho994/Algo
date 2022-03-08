import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/3/7 7:13 PM
 */
public class PathSum {

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        List<Integer> path = new ArrayList<>();
        path.add(root.val);
        trace(root, target - root.val, path, lists);
        return lists;
    }

    public void trace(TreeNode node, int target, List<Integer> path, List<List<Integer>> lists) {
        if (target == 0) {
            lists.add(new ArrayList<>(path));
        }
        if (node.left != null) {
            path.add(node.left.val);
            trace(node.left, target - node.left.val, path, lists);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            path.add(node.right.val);
            trace(node.right, target - node.right.val, path, lists);
            path.remove(path.size() - 1);
        }
    }

}
