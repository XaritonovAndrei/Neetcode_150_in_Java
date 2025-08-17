package com.problem_solving.Needcode150.Dynamic_Programming_1D;

import java.util.Arrays;

public class HouseRobber {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,1};
        System.out.println(robDaHouse(numbers));
    }
    public static int robDaHouse(int[] numbers) {
        int rob1 = 0;
        int rob2 = 0;
        int max = 0;

        for(int i=0; i<numbers.length; i++){
            max = Math.max(rob1 + numbers[i], rob2);
            rob1 = rob2;
            rob2 = max;
        }

        return max;
    }
}
