package com.arahul.competitive;

import java.util.HashMap;

public class ArraySum {
    /**
     * 
     * Problem Url: https://leetcode.com/problems/two-sum/
     * @param nums denotes the array of integers
     * @param target denotes the integer sum that is desired
     * @return an array of indices of two numbers whose sum is equal to target
     */
    public static int[] twoSumUnsorted(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();

        // populate the HashMap with the number and their indices
        for (int index = 0; index < nums.length; index ++) {
            numbers.put(nums[index], index);
        }

        // iterate and find if the required pair is present
        for (int index = 0; index < nums.length; index ++) {
            int desired = target - nums[index];

            if (numbers.containsKey(desired)) {
                if (numbers.get(desired) == index) continue;
                int[] indices = {index, numbers.get(desired)};
                return indices;
            }
        }

        return new int[0];
    }
}