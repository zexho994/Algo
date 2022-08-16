import java.util.*;
import struct.TreeNode.TreeNode;

/**
 * @author : zexho
 * @created : 2022-06-05
**/
public class InorderTraversal{
    List<Integer> ans= new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return ans;
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return ans;
    }
}
