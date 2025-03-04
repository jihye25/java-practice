package com.hye.level01.basic;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

//단어 입력 ('exit' 입력 시 종료): 안녕
//단어 입력 ('exit' 입력 시 종료): java
//단어 입력 ('exit' 입력 시 종료): collection
//단어 입력 ('exit' 입력 시 종료): 프로그래밍
//단어 입력 ('exit' 입력 시 종료): exit
//정렬 된 단어 : [collection, java, 안녕, 프로그래밍]

public class Application5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> lhset = new LinkedHashSet<>();


        while(true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료) : ");
            String word = scanner.nextLine();
            if (word.equals("exit")) {
                TreeSet<String> tset =new TreeSet<>(lhset);
                System.out.println(tset);
                break;
            } else {
                lhset.add(word);
            }
        }
    }
}
