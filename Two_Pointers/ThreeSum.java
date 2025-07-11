package com.problem_solving.Needcode150.Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] numbers = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(numbers));
    }

    public static List<List<Integer>> threeSum(int[] numbers) {

        Arrays.sort(numbers);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numbers.length && numbers[i] <= 0; i++){
            if (i == 0 || numbers[i] != numbers[i - 1]) {
                twoSum(numbers, i, result);
            }
        }
        return result;
    }

    public static void twoSum(int[] numbers, int i, List<List<Integer>> result){
        int leftPointer = i + 1;
        int rightPointer = numbers.length - 1;

        while(leftPointer < rightPointer){
            int sum = numbers[i] + numbers[leftPointer] + numbers[rightPointer];

            if (sum < 0) {
                leftPointer++;
            }
            else if (sum > 0) {
                rightPointer--;
            }
            else {
                result.add(Arrays.asList(numbers[i], numbers[leftPointer++], numbers[rightPointer--]));
                while(leftPointer < rightPointer && numbers[leftPointer] == numbers[leftPointer - 1]){
                    leftPointer++;
                }
            }
        }
    }
}
