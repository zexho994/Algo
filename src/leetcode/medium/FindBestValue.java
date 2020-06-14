package leetcode.medium;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: 994
 * @Date: 2020/6/14 14:30
 */
public class FindBestValue {
    public int findBestValue(int[] arr, int target) {
        // target/len 的平均数
        double avg = (double)target/(double)arr.length;
        return lessAvg(avg,target,arr.length,arr);
    }

    private int lessAvg(double avg,int target,int ilen,int[] arr){
        //大于平均数的和
        int maxSum = 0;
        //大于平均数的个数
        int len = 0;
        //小于平均数的和
        int minSum = 0;
        //数组最大值
        int max = 0;
        //算出大于平均的和与数理
        for(int i = 0 ; i < arr.length ;i++){
            //获取最大值
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] > avg){
                maxSum += arr[i];
                len++;
            }else{ //小于平均值得和
                minSum += arr[i];
                //归零
                arr[i] = 0;
            }
        }
        //两种情况跳出循环
        //1. 所有数都小于平均数 , 那么输出的就是max(因为max是符合要求里最小的数)
        //2. 所有的数都大于平均数, 那么就输出平均数(需要考虑4舍五入情况)
        if(len == 0 || ilen == len){
            int n = (int)avg;
            if(minSum == 0){
                if(avg - n > 0.5){
                    return (int)avg + 1;
                }
                return (int)avg;
            }else{
                return max;
            }
        }
        // 大于平均数的和/个数 = 新的平均数
        double newAvg = (double) (target - minSum) / (double) len;

        return lessAvg(newAvg,target - minSum,len,arr);
    }

    public static void main(String[] args) {
        FindBestValue findBestValue = new FindBestValue();
        int[] arr = new int[]{60864,25176,27249,21296,20204};
        int res = findBestValue.findBestValue(arr, 56803);
        System.out.println(res == 11361);

        int[] arr1 = new int[]{1,2,23,24,34,36};
        int res1 = findBestValue.findBestValue(arr1,110);
        System.out.println(res1 == 30);

        int[] arr2 = new int[]{40091,2502,74024,53101,60555,33732,23467,40560,32693,13013};
        int res2 = findBestValue.findBestValue(arr2,78666);
        System.out.println(res2 == 8463);
    }
}
