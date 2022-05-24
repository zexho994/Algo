import java.util.Arrays;

/**
 * @author : zexho
 * @created : 2022-05-24
**/
public class PivotIndex{

    public int pivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum - pre - nums[i] == pre){
                return i;
            } 
            pre += nums[i];
        }
        return -1;
    }

}
