import java.util.HashMap;
import java.util.Map;

import struct.TreeNode.TreeNode;

/**
 * @author : zexho
 * @created : 2022-06-06
**/
public class Rob{
    Map<TreeNode,Integer> s = new HashMap<>();
    Map<TreeNode,Integer> n = new HashMap<>();

    public int rob(TreeNode root) {
        dp(root);
        return Math.max(s.get(root),n.get(root));
    }

    public void dp(TreeNode node){
        if(node == null) return;
        dp(node.left);
        dp(node.right);
        s.put(node,n.getOrDefault(node.left,0) + n.getOrDefault(node.right,0)+node.val);
        n.put(node,
            Math.max(s.getOrDefault(node.left,0) , n.getOrDefault(node.left,0)) +
            Math.max(s.getOrDefault(node.right,0) , n.getOrDefault(node.right,0)));
    }
}
