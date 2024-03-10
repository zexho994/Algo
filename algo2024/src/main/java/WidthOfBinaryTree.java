import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import struct.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WidthOfBinaryTree {
    Map<Integer,Integer> minLevel = new HashMap<>();
    public int widthOfBinaryTree(TreeNode root) {
        return dfs(root,1,1);
    }

    private int dfs(TreeNode node, int depth, int idx){
        if(node == null) return 0;
        minLevel.putIfAbsent(depth, idx);
        int currentLevelWidth = idx - minLevel.get(depth)+1;
        int leftWidth = dfs(node.left,depth+1,idx*2);
        int rightWidth = dfs(node.right,depth+1,idx*2+1);
        return Math.max(currentLevelWidth,Math.max(leftWidth,rightWidth));
    }

    @Nested
    class WidthOfBinaryTreeTest {

        @Test
        public void testWidthOfBinaryTree() {
            // 创建 WidthOfBinaryTree 实例
            WidthOfBinaryTree solution = new WidthOfBinaryTree();

            // 测试一般二叉树
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(2);
            root.right = new TreeNode(3);
            root.left.right = new TreeNode(4);
            root.right.right = new TreeNode(5);
            assertEquals(4, solution.widthOfBinaryTree(root), "Width of the binary tree should be 4");

            // 可以继续添加更多的测试用例
        }
    }

}
