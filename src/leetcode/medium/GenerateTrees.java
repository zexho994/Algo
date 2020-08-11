package leetcode.medium;

import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * title: 95. 不同的二叉搜索树 II
 * content: 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
 *
 * @author: zexho
 * @created: 2020/07/21 08:51
 */
public class GenerateTrees {
    public List<TreeNode> generateTrees(int n) {
        int num = 0;
        List<TreeNode> list = new ArrayList<>();
        boolean[] memo = new boolean[n];
        for (int i = 0 ; i < n ; i++){
            memo[i] = true;
            num++;
            TreeNode node = new TreeNode(i);
            dp(memo,n,num,node,node,list);
            memo[i] = false;
            num--;
        }
        return list;
    }

    private void dp(boolean[] memo, int n, int num, TreeNode node,TreeNode root,List<TreeNode> list) {
        if(num >= n){
            list.add(root);
        }
        for(int i = 0 ; i < n && !memo[i] ; i++){
            memo[i] = true;
            TreeNode treeNode = new TreeNode(i);
            if(i < node.val){
                node.left = treeNode;
                dp(memo,n,++num,treeNode,root,list);
            }else{
                node.right = treeNode;
                dp(memo,n,++num,treeNode,root,list);
            }
            num--;
            memo[i] = false;
        }
    }

    public static void main(String[] args) {
        GenerateTrees generateTrees = new GenerateTrees();
        generateTrees.generateTrees(3);
    }

}
