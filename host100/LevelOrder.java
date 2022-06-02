import java.util.*;

/**
 * @author : zexho
 * @created : 2022-06-02
**/
public class LevelOrder{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levelList = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode poll = queue.poll();
                if(poll.left != null) queue.offer(poll.left);
                if(poll.right != null) queue.offer(poll.right);
                levelList.add(poll.val);
            }
            ans.add(levelList);
        }
        return ans;
    }
}
