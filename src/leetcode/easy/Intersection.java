package leetcode.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        Set<Integer> res = new HashSet<>();
        for (int n : nums2) {
            if (set.contains(n)) {
                res.add(n);
            }
        }
        int[] arr = new int[res.size()];
        Iterator<Integer> iterator = res.iterator();
        int idx = 0;
        while (iterator.hasNext()){
            arr[idx++] = iterator.next();
        }
        return arr;

    }
}
