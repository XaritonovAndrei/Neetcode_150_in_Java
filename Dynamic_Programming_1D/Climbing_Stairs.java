package com.problem_solving.Needcode150.Dynamic_Programming_1D;

public class Climbing_Stairs {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(n);
    }

    public int climbStairs(int n) {

        if(n==1){
            return 1;
        }
        int one = 1;
        int two = 2;

        for (int i=3; i<=n; i++){
            int steps = one + two;
            one = two;
            two = steps;
        }

        return two;
    }
}
