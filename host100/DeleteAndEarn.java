import java.util.Arrays;

/**
 * @author : zexho
 * @created : 2022-05-25
**/
public class DeleteAndEarn{
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int preDel = nums[0],preSave = 0;
        for(int i = 1; i < nums.length; i++){
            int n = nums[i];
            if(nums[i] == nums[i-1]){
                preDel += nums[i];
            }else {
                if(nums[i] == nums[i-1]+1){
                    int del = preSave + nums[i];
                    int save = Math.max(preSave,preDel);
                    preDel = del;
                    preSave = save;
                }else{
                    int del = Math.max(preDel,preSave) + nums[i];
                    int save = Math.max(preDel,preSave);
                    preDel = del;
                    preSave = save;
                }
            }
        }
        return Math.max(preDel,preSave);
    }
}
