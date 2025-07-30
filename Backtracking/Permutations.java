package com.problem_solving.Needcode150.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        System.out.println(mix(numbers));
    }

    public static List<List<Integer>> mix(int[] numbers) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] usedNumbers = new boolean[numbers.length];

        backTrack(result, new ArrayList<>(), numbers, usedNumbers);
        return result;
    }

    private static void backTrack(List<List<Integer>> result, List<Integer> currentCombination, int[] numbers, boolean[] usedNumbers) {

        //base case
        if (currentCombination.size() == numbers.length) {
            result.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            if (!usedNumbers[i]) {
                currentCombination.add(numbers[i]);
                usedNumbers[i] = true;
                backTrack(result, currentCombination, numbers, usedNumbers);
                usedNumbers[i] = false;
                currentCombination.remove(currentCombination.size() - 1);
            }
        }
    }


}