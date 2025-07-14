package com.problem_solving.Needcode150.Sliding_Window;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(findSubstring(s));
    }

    public static int findSubstring(String s) {

        //edge case
        if(s == null || s.length()==0){
            return 0;
        }

        //edge case
        if(s.length() == 1){
            return 1;
        }

        int leftPointer = 0;
        int rightPointer = 0;
        int answer = 0;

        HashSet<Character> set = new HashSet<>();

        while(rightPointer < s.length()){
            char c = s.charAt(rightPointer);
            while(set.contains(c)){
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(c);
            answer = Math.max(answer, rightPointer - leftPointer + 1);
            rightPointer++;
        }

        return answer;
    }
}
