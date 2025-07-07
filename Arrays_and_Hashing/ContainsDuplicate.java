package com.problem_solving.Needcode150.Arrays_and_Hashing;

import java.util.HashSet;

/**
 * can be solved with:
 *      brute force: nested loop, compare i to j
 *      sorting: sort array, compare i to (i - 1)
 *      hashmap: key = number, value = freq counter
 */

class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums1 = {1,3,6,7}; // no duplicate
        int[] nums2 = {1,4,5,9,4}; // with duplicate
        System.out.println("nums1: " + containsDuplicateHashSetMethod(nums1));
        System.out.println("nums2: " + containsDuplicateHashSetMethod(nums2));
    }

    public static boolean containsDuplicateHashSetMethod(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i< nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }
}

