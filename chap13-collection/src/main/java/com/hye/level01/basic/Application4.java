package com.hye.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

//학생 ID 입력('exit' 입력 시 종료): hello
//ID가 추가 되었습니다.
//학생 ID 입력('exit' 입력 시 종료): java
//ID가 추가 되었습니다.
//학생 ID 입력('exit' 입력 시 종료): programmer
//ID가 추가 되었습니다.
//학생 ID 입력('exit' 입력 시 종료): java
//이미 등록 된 ID입니다.
//학생 ID 입력('exit' 입력 시 종료): exit
//모든 학생의 ID : [java, programmer, hello]

public class Application4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> hset = new HashSet<>();

        while(true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료) : ");
            String id = scanner.nextLine();

            if(id.equals("exit")) {
                System.out.println(hset);
                break;
            }else if(hset.contains(id)) {
                System.out.println("이미 등록 된 ID입니다.");
            }else{
                hset.add(id);
                System.out.println("ID가 추가 되었습니다.");


            }



        }


    }
}
