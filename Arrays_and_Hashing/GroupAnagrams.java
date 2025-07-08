package com.problem_solving.Needcode150.Arrays_and_Hashing;


import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] stringArray = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(stringArray));
    }

    public static List<List<String>> groupAnagrams(String[] stringArray) {

        //edge case
        if(stringArray.length == 0){
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        int[] countedLetters = new int[26];

        for(String s : stringArray) {
            Arrays.fill(countedLetters, 0);
            for(char c : s.toCharArray()){
                countedLetters[c-'a']++;
            }

            StringBuilder sb = new StringBuilder("");

            //creating unique word signature
            for(int i=0; i<26; i++){
                sb.append("#");
                sb.append(countedLetters[i]);
            }

            String wordKey = sb.toString();

            if(!map.containsKey(wordKey)){
                map.put(wordKey,new ArrayList());
            }

            map.get(wordKey).add(s);

        }

        return new ArrayList(map.values());

    }
}
