package com.problem_solving.Needcode150.Sliding_Window;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        String s1 = "ABAB";
        String s2 = "AABABBA";
        int k1 = 2;
        int k2 = 1;
        System.out.println("(ABAB, k = 1) -> " + replaceChar(s1, k1));
        System.out.println("(AABABBA, k = 2) -> " + replaceChar(s2, k2));
    }

    public static int replaceChar(String s, int k) {

        int[] freqArray = new int[26];
        int leftPointer = 0;
        int answer = 0;
        int maxOccurance = 0;

        for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            maxOccurance = Math.max(maxOccurance, freqArray[s.charAt(rightPointer) - 'A']);
            freqArray[s.charAt(rightPointer) - 'A']++;
            if (rightPointer - leftPointer + 1 - maxOccurance > k) {

                freqArray[s.charAt(leftPointer) - 'A']--;
                leftPointer++;
            }
            answer = Math.max(answer, rightPointer - leftPointer + 1);
        }

        return answer;


    }
}
