/**
 * @author : zexho
 * @created : 2022-05-23
**/
public class SubarraySum{

    public int subarraySum(int[] nums, int k) {
        int count = 0,sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += j;
                if(sum == k){
                    count++;
                }
            }
        }
        return count;
    }

}
