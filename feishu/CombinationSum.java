import java.util.ArrayList;
import java.util.List;

/**
 * @author Zexho
 * @date 2022/4/9 11:25 PM
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        this.find(ans, new ArrayList<>(),candidates,0,target);
        return ans;
    }

    private void find(List<List<Integer>> ans,List<Integer> sub,int[] candidates,int idx,int target){
        if(target == 0){
            ans.add(new ArrayList<>(sub));
            return;
        }
        if(idx == candidates.length){
            return;
        }

        int n = 0;
        find(ans,sub,candidates,idx+1,target);
        if(target >= candidates[idx]){
            sub.add(candidates[idx]);
            this.find(ans,sub,candidates,idx,target - candidates[idx]);
            sub.remove(sub.size()-1);
        }
    }

}
