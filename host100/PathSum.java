/**
 * @author : zexho
 * @created : 2022-06-08
**/
public class PathSum{
    private int ans = 0;

    public int pathSum(TreeNode root, int targetSum) {
        path(root,targetSum,false);
        return ans;
    }

    public void path(TreeNode node,int sum, boolean preDel){
        if(node == null) return;
        if(sum - node.val == 0) ans++;

        if(!preDel){
            path(node.left,sum,false);
            path(node.right,sum,false);
        }
        path(node.left,sum - node.val,true);
        path(node.right,sum - node.val,true);
    }

}
