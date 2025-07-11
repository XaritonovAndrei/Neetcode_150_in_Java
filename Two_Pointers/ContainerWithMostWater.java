package com.problem_solving.Needcode150.Two_Pointers;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println(findMaxArea(heights));
    }

    public static int findMaxArea(int[] heights) {

        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = heights.length - 1;

        while (leftPointer < rightPointer) {

            int width = Math.min(heights[leftPointer], heights[rightPointer]);
            int length = rightPointer - leftPointer;

            maxArea = Math.max(maxArea, width*length);

            if (heights[leftPointer] < heights[rightPointer]) {
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }

        return maxArea;
    }
}
