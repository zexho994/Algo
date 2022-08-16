import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : zexho
 * @created : 2022-05-30
 **/
public class Flatten {
    public void flatten(TreeNode root) {
        if (root == null) return;
        List<TreeNode> nodeList = new ArrayList<>();
        collectNode(root, nodeList);
        int len = nodeList.size() - 1;
        for (int i = 0; i < len; i++) {
            nodeList.get(i).left = null;
            nodeList.get(i).right = nodeList.get(i + 1);
        }
        nodeList.get(len).left = null;
        nodeList.get(len).right = null;
    }

    public void collectNode(TreeNode node, List<TreeNode> nodeList) {
        if (node == null) return;
        nodeList.add(node);
        collectNode(node.left, nodeList);
        collectNode(node.right, nodeList);
    }
}
