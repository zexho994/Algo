/**
 * @author : zexho
 * @created : 2022-05-24
**/
public class IsUnivalTree{
    public boolean isUnivalTree(TreeNode root) {
        if(root == null) return true;
        return preOrder(root,root.val);
    }

    public boolean preOrder(TreeNode node,int n){
        if(node == null) return true;
        if(node.val != n) return false;
        if(!preOrder(node.left,n)) return false;
        return preOrder(node.right,n);
    }
}
