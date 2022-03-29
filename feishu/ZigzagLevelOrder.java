import struct.TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Zexho
 * @date 2022/3/29 10:57 PM
 */
public class ZigzagLevelOrder {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        boolean flag = true;
        while (!stack.isEmpty()) {
            int size = stack.size();
            Stack<TreeNode> tmp = new Stack<>();
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode pop = stack.pop();
                if (flag) {
                    if (pop.left != null) {
                        tmp.push(pop.left);
                    }
                    if (pop.right != null) {
                        tmp.push(pop.right);
                    }
                } else {
                    if (pop.right != null) {
                        tmp.push(pop.right);
                    }
                    if (pop.left != null) {
                        tmp.push(pop.left);
                    }
                }
                sub.add(pop.val);
            }
            ans.add(sub);
            stack = tmp;
            flag = !flag;
        }
        return ans;
    }

}
