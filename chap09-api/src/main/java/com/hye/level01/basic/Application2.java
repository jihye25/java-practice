package com.hye.level01.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = scanner.nextLine();
        String[] words = str.split("\\s+");

        Map<String, Integer> wordCount = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].trim().toLowerCase();

            words[i] = words[i].replaceAll("[^a-zA-Z]", "");

            if (words[i].matches("[a-zA-Z]+")) {
                if (wordCount.containsKey(words[i])) {
                    wordCount.put(words[i], wordCount.get(words[i]) + 1);
                } else {
                    wordCount.put(words[i], 1);
                }
            }
        }


        System.out.println("======= 단어 빈도 =======");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        String manyWord = "";
        int first = 0;


        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > first) {
                manyWord = entry.getKey();
                first = entry.getValue();
    }
}
        System.out.println("가장 빈도 높은 단어 : " + manyWord + " (" + first + " 번)");

        scanner.close();
    }
}
