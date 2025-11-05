package DAY5.HW.HW1;
import java.util.*;
public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                int complement = target - nums[i];
                if (map.containsKey(complement)) {
                    return new int[]{ map.get(complement), i };
                }
                map.put(nums[i], i);
            }
            return new int[]{};
        }
        public static void main(String[] args) {
            TwoSum sol = new TwoSum();

            int[] nums1 = {2, 7, 11, 15};
            int target1 = 9;
            System.out.println(Arrays.toString(sol.twoSum(nums1, target1)));

            int[] nums2 = {6, 5, 4, 8};
            int target2 = 12;
            System.out.println(Arrays.toString(sol.twoSum(nums2, target2)));
        }
}
