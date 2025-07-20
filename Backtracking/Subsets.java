package com.problem_solving.Needcode150.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7};
        System.out.println(generateSubsets(numbers));
    }

    public static List<List<Integer>> generateSubsets(int[] numbers) {
        List<List<Integer>> result = new ArrayList<>();
        helper(0, numbers, new ArrayList<>(), result);
        return result;
    }

    private static void helper(int index, int[] numbers, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));
        for (int i = index; i < numbers.length; i++) {
            current.add(numbers[i]);
            helper(i + 1, numbers, current, result);
            current.remove(current.size() - 1);
        }
    }
}
