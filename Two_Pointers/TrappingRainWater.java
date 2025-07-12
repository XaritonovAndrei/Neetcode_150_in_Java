package com.problem_solving.Needcode150.Two_Pointers;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(calcWater(heights));
    }
    public static int calcWater(int[] heights) {
        int leftPointer = 0;
        int rightPointer = heights.length - 1;

        int totalWater = 0;
        int leftMax = heights[0];
        int rightMax = heights[rightPointer];

        while (leftPointer < rightPointer) {
            if (heights[leftPointer] < heights[rightPointer]) {
                leftMax = Math.max(leftMax, heights[leftPointer]);
                if (leftMax - heights[leftPointer] > 0) {
                    totalWater = totalWater + leftMax - heights[leftPointer];
                }
                leftPointer++;
            }
            else{
                rightMax = Math.max(rightMax,heights[rightPointer]);
                if (rightMax - heights[rightPointer] > 0) {
                    totalWater = totalWater + rightMax - heights[rightPointer];
                }
                rightPointer--;
            }
        }
        return totalWater;
    }
}
