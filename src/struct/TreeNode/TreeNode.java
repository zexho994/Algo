package struct.TreeNode;

/**
 * @description: 二叉搜索树结构
 * @author: zexho
 * @created: 2020/07/21 08:54
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
