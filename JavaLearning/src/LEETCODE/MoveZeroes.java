package LEETCODE;

import java.util.*;
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Original Array: " + Arrays.toString(nums));

        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos] = nums[i];
                pos++;
            }
        }
        while (pos < nums.length) {
            nums[pos] = 0;
            pos++;
        }

        System.out.println("After moving zeroes to the end: " + Arrays.toString(nums));
    }
}