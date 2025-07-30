package com.problem_solving.Needcode150.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(findCombination(candidates, target));
    }

    public static List<List<Integer>> findCombination(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();

        backTrack(target, result, currentCombination, 0, candidates);

        return result;
    }

    public static void backTrack(int target, List<List<Integer>> result, List<Integer> currentCombination, int start, int[] candidates) {

        //base cases
        if(target == 0) {
            result.add(new ArrayList<Integer>(currentCombination));
        }
        else if(target < 0) {
            return;
        }

        for(int i = start; i < candidates.length; i++) {
            currentCombination.add(candidates[i]);
            backTrack(target-candidates[i], result, currentCombination, i, candidates);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}

