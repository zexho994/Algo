
/**
 * @author : zexho
 * @created : 2022-06-02
**/
public class DeleteNode{
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return root;
        if(root.val > key){
            root.left = deleteNode(root.left,key);
        }else if (root .val < key){
            root.right = deleteNode(root.right,key);
        }else {
            if(root.left == null) {
                root = root.right;
            } else if(root.right == null) {
                root = root.left;
            } else {
                TreeNode node = root.right;
                while(node.left != null){
                    node = node.left;
                }
                node.left = root.left;
                root = root.right;
            }
        }
        return root;
    }

}
