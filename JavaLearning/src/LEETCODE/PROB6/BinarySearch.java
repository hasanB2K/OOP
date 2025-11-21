package LEETCODE.PROB6;

import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,11};
        int target = 7;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Target: " + target);

        int idx = search(nums, target);
        System.out.println("Index of target: " + idx);
    }

    public static int search(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] == target) return mid;
            if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}