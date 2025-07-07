package com.problem_solving.Needcode150.Arrays_and_Hashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int remainder = target - nums[i];
            if (map.containsKey(remainder)) {
                return new int[] {map.get(remainder), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }
}
