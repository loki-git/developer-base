package com.loki.developerbase.developer;

import java.util.Arrays;

/**
 * @Author xujs
 */
public class TwoSumTest {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] newNum = twoSum(nums, target);
        Arrays.stream(newNum).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}


