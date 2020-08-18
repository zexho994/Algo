package leetcode.medium;

import struct.ListNode.ListNode;
import struct.TreeNode.TreeNode;

import java.util.ArrayList;

/**
 *
 * @author Zexho
 * @created 2020/8/18 11:11 下午
 */
public class SortedListToBST {
    public TreeNode sortedListToBST(ListNode head) {

        ListNode tmpList = head;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int count = 0;

        while(tmpList != null){
            arrayList.add(tmpList.val);
            tmpList = tmpList.next;
            count++;
        }

        if(count == 0){
            return null;
        }

        return dp(arrayList,0,arrayList.size() - 1);
    }

    public TreeNode dp(ArrayList<Integer> arrays,int left,int right){
        if(left > right){
            return null;
        }

        int mid = (right - left)/2 + left;

        TreeNode treeNode = new TreeNode(arrays.get(mid));
        treeNode.left = dp(arrays,left,mid - 1);
        treeNode.right = dp(arrays,mid+1,right);

        return treeNode;
    }
}
