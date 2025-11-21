package LEETCODE.PROB2;

import java.util.*;
public class ContainsDuplicate {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 1};

        System.out.println("Array: " + Arrays.toString(nums));

        Set<Integer> set = new HashSet<>();

        boolean hasDuplicate = false;

        for (int num : nums) {
            if (!set.add(num)) {
                hasDuplicate = true;
                break;
            }
        }

        System.out.println("Contains Duplicate: " + hasDuplicate);
    }
}