package com.arahul.competitive;

import java.util.HashMap;

public class ArraySum {
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