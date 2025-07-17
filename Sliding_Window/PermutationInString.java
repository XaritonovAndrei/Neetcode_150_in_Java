package com.problem_solving.Needcode150.Sliding_Window;

import java.util.Arrays;

public class PermutationInString {

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        //edge case
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1FreqArray = new int[26];
        int[] s2FreqArray = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1FreqArray[s1.charAt(i) - 'a']++;
            s2FreqArray[s2.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s2.length() - s1.length(); i++) {

            if (freqArrayComparator(s1FreqArray, s2FreqArray)) {
                return true;
            }

            s2FreqArray[s2.charAt(i + s1.length()) - 'a']++; // Adding one next char
            s2FreqArray[s2.charAt(i) - 'a']--; // Removing latest char
        }

        return freqArrayComparator(s1FreqArray, s2FreqArray);
    }

    // Helper method for comparing two frequency arrays
    private static boolean freqArrayComparator(int[] s1FreqArray, int[] s2FreqArray) {
        for (int i = 0; i < 26; i++) {
            if (s1FreqArray[i] != s2FreqArray[i]) {
                return false;
            }
        }
        return true;
    }
}
