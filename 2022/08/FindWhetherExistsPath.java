import java.util.*;

public class FindWhetherExistsPath {
    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, LinkedList<Integer>> map = new HashMap<>();

        for (int[] path : graph) {
            if (!map.containsKey(path[0])) {
                map.put(path[0], new LinkedList<>());
            }
            map.get(path[0]).add(path[1]);
        }
        return findPath(start, target, map, set);
    }

    public boolean findPath(int start, int target, Map<Integer, LinkedList<Integer>> map, Set<Integer> set) {
        LinkedList<Integer> outs = map.get(start);
        if(outs == null) return false;
        for (int i = 0; i < outs.size(); i++) {
            Integer out = outs.get(i);
            if (!set.contains(out)) {
                set.add(out);
                if (out == target || findPath(out, target, map, set)) {
                    return true;
                }
            }
        }
        return false;
    }
}
