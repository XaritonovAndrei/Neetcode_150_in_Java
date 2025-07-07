package com.problem_solving.Needcode150.Arrays_and_Hashing;

import java.util.HashMap;

/**
 * hash map method based on comparison of two freq maps
 */

public class ValidAnagram {

    public static void main(String[] args) {
        String s = "test";
        String t = "sett";
        String w = "set";
        System.out.println("test, sett: " + checkForAnagramASCIIMethod(s, t));
        System.out.println("test, set: " + checkForAnagramASCIIMethod(s, w));
        System.out.println("test, sett: " + checkForAnagramHashMapMethod(s, t));
        System.out.println("test, set: " + checkForAnagramHashMapMethod(s, w));
    }

    public static boolean checkForAnagramASCIIMethod(String s, String t) {

        //edge case
        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }

    public static boolean checkForAnagramHashMapMethod(String s, String t) {

        //edge case
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sMap.equals(tMap);
    }
}
