import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, targetSum, ans, new LinkedList<>());
        return ans;
    }

    public void dfs(TreeNode node, int targetSum, List<List<Integer>> ans, LinkedList<Integer> path) {
        if (node == null) return;
        int n = targetSum - node.val;
        path.addLast(node.val);
        if (n == 0 && node.left == null && node.right == null) {
            ans.add(new LinkedList<>(path));
        } else {
            dfs(node.left, n, ans, path);
            dfs(node.right, n, ans, path);
        }
        path.removeLast();
    }
}
