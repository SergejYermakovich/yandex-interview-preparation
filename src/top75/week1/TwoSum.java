package top75.week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
* Given an array of integers nums and an integer target,
*  return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution,
* and you may not use the same element twice.

You can return the answer in any order.
* */
public class TwoSum {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 1, 5, 6, 7, 8}, 5)));
        System.out.println(Arrays.toString(twoSum2(new int[]{1, 2, 3, 1, 5, 6, 7, 8}, 5)));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] {map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
