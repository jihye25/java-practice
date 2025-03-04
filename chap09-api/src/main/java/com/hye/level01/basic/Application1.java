package com.hye.level01.basic;

import java.util.Scanner;



public class Application1 {


    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */


        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String sen = sc.nextLine();

        String[] words = sen.split("\\s+");

        StringBuilder sb = new StringBuilder();
        int count = 0;

            for (int i = 0; i < words.length; i++) {
                sb.append(words[i].substring(0, 1).toUpperCase())
                        .append(words[i].substring(1).toLowerCase())
                        .append(" ");
                count++;
            }


        String result = sb.toString().trim();


        System.out.println("변환된 문자열 : " + result);
        System.out.println("총 단어 개수 : " + count);

        sc.close();
    }
}
