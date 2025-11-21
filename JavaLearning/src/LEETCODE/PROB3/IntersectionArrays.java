package LEETCODE.PROB3;

import java.util.*;
public class IntersectionArrays {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        Set<Integer> set = new HashSet<>();
        for (int x : nums1) {
            set.add(x);
        }

        Set<Integer> ans = new HashSet<>();
        for (int x : nums2) {
            if (set.contains(x)) {
                ans.add(x);
            }
        }

        System.out.println("Intersection: " + ans);
    }
}