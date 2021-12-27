package 专项突破.树.二叉搜索树;

import struct.TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Zexho
 * @date 2021/12/24 2:53 PM
 */
public class InorderSuccessor {

    List<TreeNode> list = new LinkedList<>();

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        inorder(root);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).val == p.val) {
                return list.get(i + 1);
            } else if (list.get(i).val > p.val) {
                return list.get(i);
            }
        }
        return null;
    }

    private void inorder(TreeNode node) {
        if (node != null) {
            inorder(node.left);
            list.add(node);
            inorder(node.right);
        }
    }

}
