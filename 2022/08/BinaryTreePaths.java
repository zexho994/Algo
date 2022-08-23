import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        dfs(root, ans, "");
        return ans;
    }

    public void dfs(TreeNode node, List<String> ans, String path) {
        if (node != null) {
            path = path + String.valueOf(node.val);
            if(node.left == null && node.right == null){
                ans.add(path);
                return;
            }
            path = path + "->";
            dfs(node.left, ans, path);
            dfs(node.right, ans, path);
        }
    }
}
