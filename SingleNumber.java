package com.problem_solving.Needcode150;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            //XOR
            result ^= num;
        }
        return result;
    }
}