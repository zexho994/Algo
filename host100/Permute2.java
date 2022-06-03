import java.util.List;
import java.util.ArrayList;

/**
 * @author : zexho
 * @created : 2022-05-28
**/
public class Permute2{

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        collect(nums,0,ans,new ArrayList<>());
        return ans;
    }

    public void collect(int[] nums,int idx,List<List<Integer>> ans,List<Integer> path){
        if(idx == nums.length){
            ans.add(new ArrayList<>(path));
        }

        for(int i = idx; i < nums.length; i++){
            swap(nums,idx,i);
            path.add(nums[idx]);
            collect(nums,idx+1,ans,path);
            path.remove(path.size()-1);
            swap(nums,idx,i);
        }
    }

    public void swap(int[] nums,int n1,int n2){
        int t = nums[n1];
        nums[n1] = nums[n2];
        nums[n2] = t;
    }

}
