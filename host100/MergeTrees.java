/**
 * @author : zexho
 * @created : 2022-06-15
**/
public class MergeTrees{
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return merge(new TreeNode(0),root1,root2);
    }

    public TreeNode merge(TreeNode node,TreeNode n1,TreeNode n2){
        if (n1 == null && n2 == null) {
            return null;
        }
        int s1 = 0, s2 = 0;
        TreeNode l1 = null ,l2 = null;
        TreeNode r1 = null ,r2 = null;
        if (n1 != null){
            s1 = n1.val;
            l1 = n1.left;
            r1 = n1.right;
        }
        if (n2 != null){
            s2 = n2.val;
            l2 = n2.left;
            r2 = n2.right;
        }
        node.val = s1 + s2;
        node.left = merge(new TreeNode(0),l1,l2);
        node.right = merge(new TreeNode(0),r1,r2);
        return node;
    }
}
