/**
 * @author : zexho
 * @created : 2022-05-17
**/
public class MaxArea{
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1;
        int area = 0;
        while(left < right){
            if (height[left] < height[right]){
                area = Math.max(area,height[left]*(right-left));
                left++;
            }else{
                area = Math.max(area,height[right]*(right-left));
                right--;
            }
        }
        return area;
    }
}
