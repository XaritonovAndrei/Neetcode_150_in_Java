package com.problem_solving.Needcode150.Arrays_and_Hashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(nums) + " -> " + Arrays.toString(findProduct(nums)));
    }

    public static int[] findProduct(int[] nums) {

        int n = nums.length;
        int[] prefixes = new int[n];
        int[] suffixes = new int[n];
        prefixes[0] = 1;
        suffixes[n - 1] = 1;

        // {1,2,3,4} -> {1,1,2,6}
        for(int i = 1; i < n; i++) {
            prefixes[i] = prefixes[i - 1] * nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--) {
            suffixes[i] = suffixes[i + 1] * nums[i + 1];
        }

        int answer[] = new int[n];
        for(int i = 0; i < n; i++) {
            answer[i] = prefixes[i] * suffixes[i];
        }
        return answer;
    }
}
