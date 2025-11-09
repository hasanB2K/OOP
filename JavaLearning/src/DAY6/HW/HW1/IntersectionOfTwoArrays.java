package DAY6.HW.HW1;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) set1.add(num);

        Set<Integer> intersection = new HashSet<>();
        for (int num : nums2)
            if (set1.contains(num)) intersection.add(num);

        int[] result = new int[intersection.size()];
        int i = 0;
        for (int num : intersection) result[i++] = num;

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = intersection(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }
}


