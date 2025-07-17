package com.problem_solving.Needcode150.Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        String s1 = "()"; //true
        String s2 = "()[]{}"; //true
        String s3 = "(]"; //false
        System.out.println("s1: " + validateParenthesis(s1));
        System.out.println("s2: " + validateParenthesis(s2));
        System.out.println("s3: " + validateParenthesis(s3));
    }

    public static boolean validateParenthesis(String s) {

        HashMap<Character, Character> mappedBrackets = new HashMap<>();

        mappedBrackets.put('(', ')');
        mappedBrackets.put('[', ']');
        mappedBrackets.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){

            char c = s.charAt(i);
            if (mappedBrackets.containsKey(c)) {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;
                char topElement = stack.pop();  // (
                if (mappedBrackets.get(topElement) != c) {
                    return false;
                }
            }
        }

        if (stack.isEmpty()) return true;
        else return false;
    }
}
