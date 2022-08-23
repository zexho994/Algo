public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root,targetSum);
    }

    public boolean dfs(TreeNode node,int targetSum){
        if(node == null) return false;
        int n = targetSum - node.val;
        if(n == 0 && node.left == null && node.right == null) return true;
        return dfs(node.left,n) || dfs(node.right,n);
    }
}
