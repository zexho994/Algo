/**
 * @author : zexho
 * @created : 2022-05-30
**/
public class MaxDepth{
    public int maxDepth(TreeNode root) {
        return dfs(root,1);
    }

    public int dfs(TreeNode node,int depth){
        if(node == null) return 0;
        return Math.max(dfs(node.left,depth)+1,dfs(node.right,depth)+1);
    }
}
