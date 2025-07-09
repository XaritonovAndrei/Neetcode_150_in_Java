package com.problem_solving.Needcode150.Arrays_and_Hashing;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,4};
        System.out.println(longestSeq(nums));
    }

    public static int longestSeq(int[] nums) {

        //edge case
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> numsHashSet = new HashSet<>();
        for (int i=0; i<nums.length; i++) {
            numsHashSet.add(nums[i]);
        }

        int currentLongestSeq = 1;

        for (int num : numsHashSet) {
            if (numsHashSet.contains(num - 1)) {
                continue;
            }
            else {
                int currentNum = num;
                int currentSeq = 1;
                while (numsHashSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentSeq++;
                }

                currentLongestSeq = Math.max(currentLongestSeq, currentSeq);
            }
        }
        
        return currentLongestSeq;
    }
}
