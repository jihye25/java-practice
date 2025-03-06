package com.hye.section05.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Practice2 {
    public String solution(String command, Integer[] array) {

        Deque<Integer> deque = new LinkedList<>();
        for(Integer num : array){
            deque.offer(num);
        }

        boolean isReversed = false;
        for(char c : command.toCharArray()){
            if(c == 'R'){
                isReversed = !isReversed;
            } else if (c == 'D') {
                if (deque.isEmpty()) {
                    return "error";
                }
                if (isReversed) {
                    deque.pollLast();
                } else {
                    deque.pollFirst();
                }
            }
        }
        if(deque.isEmpty()){
            return "[]";
        }

        StringBuilder result =new StringBuilder("[");
        for(Integer num : deque){
            result.append(num).append(",");
        }
        result.setLength(result.length()-1);
        result.append("]");

        return result.toString();
    }
}
