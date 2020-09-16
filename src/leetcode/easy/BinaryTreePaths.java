package leetcode.easy;

import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @created 2020/9/4 9:57 下午
 */
public class BinaryTreePaths {
    public static final String arrow = "->";
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        dfs(root,"",res);
        return res;
    }

    public void dfs(TreeNode root,String path,List<String> res){
        if(root == null){
            return;
        }
        String newPath = path+root.val;
        if(root.left == null && root.right == null){
            res.add(newPath);
            return;
        }
        if(root.left != null){
            dfs(root.left,newPath+arrow,res);
        }
        if(root.right != null){
            dfs(root.right,newPath+arrow,res);
        }
        return;
    }
}
