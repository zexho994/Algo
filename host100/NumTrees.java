/**
 * @author : zexho
 * @created : 2022-05-30
**/
public class NumTrees{
    public int numTrees(int n) {
        return count(new int[n],1,n);
    }

    public int count(int[] len,int left,int right){
        if(left >= right) return 1;
        if(len[right - left] != 0) return len[right - left];

        int sum = 0;
        for(int i = left; i <= right; i++){
            sum += count(len,left,i-1) * count(len,i+1,right);
        }
        len[right - left] = sum;
        return sum;
    }
}
