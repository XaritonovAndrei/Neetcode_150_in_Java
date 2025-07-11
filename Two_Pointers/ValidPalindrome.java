package com.problem_solving.Needcode150.Two_Pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(s));
    }
    public static boolean checkPalindrome(String s) {

        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer){
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(leftPointer))){
                leftPointer++;
            }
            while (leftPointer < rightPointer && !Character.isLetterOrDigit(s.charAt(rightPointer))){
                rightPointer--;
            }
            if (Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer))){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
