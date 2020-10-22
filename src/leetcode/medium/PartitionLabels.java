package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        List<Integer> list = new ArrayList<>();
        int pre = 0;
        int next = 0;

        for (int i = 0; i < S.length(); i++) {
            // 获取局部最优解
            next = Math.max(findLastPos(S,i),next);
            if(next == i){
                list.add(i - pre + 1);
                pre = i + 1;
                next = i + 1;
            }
        }

        return list;
    }


    public int findLastPos(String S, int idx) {
        int max = idx;
        for (int i = idx; i < S.length(); i++) {
            if(S.charAt(i) == S.charAt(idx)){
                max = i;
            }
        }
        return max;
    }
}
