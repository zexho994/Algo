import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeRange {

    public int[][] merge(int[][] intervals) {

        List<Integer[]> result = new ArrayList<>();

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        for(int i = 0; i < intervals.length;i++){
            Integer[] subArr = new Integer[]{intervals[i][0],intervals[i][1]};
            for(int j = i+1; j < intervals.length;j++){
                Integer[] subResult = mregeTwoRange(subArr,intervals[j]);
                if(subResult != null){
                    subArr = subResult;
                    i = j;
                }else{
                    break;
                }
            }
            result.add(subArr);
        }

        int[][] array = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            Integer[] row = result.get(i);
            array[i] = new int[row.length];
            for (int j = 0; j < row.length; j++) {
                array[i][j] = row[j];
            }
        }
        return array;
    }

    private Integer[] mregeTwoRange(Integer[] arr1, int[] arr2){
        if(arr1[0] <= arr2[0] && arr1[1] >= arr2[1]){
            return new Integer[]{arr1[0],arr1[1]};
        }else if (arr1[0] >= arr2[0] && arr1[1] <= arr2[1]){
            return new Integer[]{arr2[0],arr2[1]};
        }else if(arr1[0] >= arr2[0] && arr1[0] <= arr2[1]){
            return new Integer[]{Math.min(arr1[0],arr2[0]),Math.max(arr1[1],arr2[1])};
        }else if (arr1[1] >= arr2[0] && arr1[1] <= arr2[1]){
            return new Integer[]{Math.min(arr1[0],arr2[0]),Math.max(arr1[1],arr2[1])};
        }
        return null;
    }

    @Nested
    class Test{
        @org.junit.jupiter.api.Test
        public void test(){
            MergeRange mr = new MergeRange();
            mr.merge(new int[][]{
                    new int[]{1,3},
                    new int[]{2,6},
                    new int[]{8,10},
                    new int[]{15,18},
            });

        }
    }

}
