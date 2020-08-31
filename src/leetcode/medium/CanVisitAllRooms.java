package leetcode.medium;

import java.util.List;

/**
 * @author Zexho
 * @created 2020/8/31 8:49 上午
 */
public class CanVisitAllRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int length = rooms.size();
        boolean[] accessed = new boolean[rooms.size()];
        accessed[0] = true;
        dp(rooms,0,accessed);
        for(boolean flag : accessed){
            if(!flag){
                return false;
            }
        }
        return true;
    }

    public void dp(List<List<Integer>> rooms, int idx, boolean[] accessed) {
        for (Integer key : rooms.get(idx)) {
            if (accessed[key]) {
                continue;
            }
            accessed[key] = true;
            dp(rooms,key,accessed);
        }
    }
}
