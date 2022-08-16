import java.util.List;
import java.util.ArrayList;

/**
 * @author : zexho
 * @created : 2022-05-29
**/
public class Subsets{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        process(nums,0,new ArrayList<>(), ans);
        return ans;
    }

    public void process(int[] nums,int idx,List<Integer> path,List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        
        //选
        process(nums,idx+1,path,ans);

        //不选
        path.add(nums[idx]);
        process(nums,idx+1,path,ans);
        path.remove(path.size() - 1);
    }
}
