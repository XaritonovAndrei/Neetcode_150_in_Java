package com.problem_solving.Needcode150.Two_Pointers;

import java.util.Arrays;

public class TwoSum2InputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum2(numbers, target)));
    }
    public static int[] twoSum2(int[] numbers, int target) {

        int leftPointer = 0;
        int rightPointer = numbers.length - 1;

        while (leftPointer < rightPointer) {
            if (numbers[leftPointer] + numbers[rightPointer] > target) {
                rightPointer = rightPointer - 1;
            }
            else if (numbers[leftPointer] + numbers[rightPointer] < target) {
                leftPointer = leftPointer + 1;
            }
            else if (numbers[leftPointer] + numbers[rightPointer] == target) {
                return new int[] {leftPointer + 1, rightPointer + 1};
            }
        }

        return null;
    }
}
