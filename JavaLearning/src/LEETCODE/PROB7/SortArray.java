package LEETCODE.PROB7;

import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int[] nums = {5,2,3,1,4};

        System.out.println("Original Array: " + Arrays.toString(nums));

        Arrays.sort(nums);

        System.out.println("Sorted Array: " + Arrays.toString(nums));
    }
}