package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 39. 组合总和
 * @author Zexho
 * @created 2020/9/9 8:31 上午
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> reslist = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        dp(candidates,target,0,reslist,list);
        return reslist;
    }

    public void dp(int[] candidates,int target,int n,List<List<Integer>> reslist,List<Integer> list){
        if(target == 0){
            reslist.add(new ArrayList<>(list));
            return;
        }

        if(target < 0){
            return;
        }

        while (n < candidates.length){
            list.add(candidates[n]);
            dp(candidates,target - candidates[n],n++,reslist,list);
            list.remove(list.size()-1);
        }
    }
}
