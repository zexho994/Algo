/**
 * @author : zexho
 * @created : 2022-06-09
**/
public class DiameterOfBinaryTree{
    int maxLen = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return maxLen;
    }

    public int dfs(TreeNode root){
        if(root == null) return -1;
        int leftLen = dfs(root.left) + 1;
        int rightLen = dfs(root.right) + 1;
        maxLen = Math.max(maxLen,leftLen + rightLen);
        return Math.max(leftLen,rightLen);
    }
}
