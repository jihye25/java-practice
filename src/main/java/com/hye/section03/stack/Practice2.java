package com.hye.section03.stack;


import java.io.IOException;
import java.util.Stack;

public class Practice2 {
    public int solution(String input) throws IOException {

        Stack<Character> stack = new Stack<>();

        int total = 0;


       for(int i=0; i<input.length();i++) {
           char c = input.charAt(i);
            if (c == '(' ) {
                stack.push(c);

            } else if(c == ')') {
                stack.pop();

                if (input.charAt(i - 1) == '(') {
                    total += stack.size();
                } else {
                    total++;
                }
            }
        }
        return total;
    }
}
