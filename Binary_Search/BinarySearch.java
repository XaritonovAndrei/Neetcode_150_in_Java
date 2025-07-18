package com.problem_solving.Needcode150.Binary_Search;


public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {-1,0,3,5,9,12};
        int target1 = 9; // valid
        int target2 = 555; //invalid
        System.out.println(target1 + " at position " + binarySearch(numbers, target1));
        System.out.println(target2 + " at position " + binarySearch(numbers, target2));
    }


    public static int binarySearch(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

}

