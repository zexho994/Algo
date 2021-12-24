package 专项突破.树.dfs;

import struct.TreeNode.TreeNode;

/**
 * @author Zexho
 * @date 2021/12/18 1:22 PM
 */
public class Codec {
    int idx = 0;

    // Encodes a tree to a single string.
    //    1
    //  2   3   ==> "1,2,3,#,#,4,#"
    //     4
    public String serialize(TreeNode root) {
        return root == null ? "#" : root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        idx = 0;
        String[] split = data.split(",");
        return parse(split);
    }

    private TreeNode parse(String[] split) {
        if (idx >= split.length || "#".equals(split[idx])) {
            return null;
        }
        TreeNode treeNode = new TreeNode(Integer.parseInt(split[idx]));
        idx++;
        treeNode.left = parse(split);
        idx++;
        treeNode.right = parse(split);
        return treeNode;
    }

}
