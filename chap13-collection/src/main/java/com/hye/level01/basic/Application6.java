package com.hye.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동010-1234-5678
//입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 홍길동 010-1234-5678
//추가 완료 : 홍길동 010-1234-5678
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): 유관순 010-9876-5432
//추가 완료 : 유관순 010-9876-5432
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
//검색 할 이름 : 유관순
//유관순씨의 전화번호 : 010-9876-5432
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): search
//검색 할 이름 : 이순신
//이순신씨의 번호는 등록 되어 있지 않습니다.
//이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): exit



public class Application6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> hmap = new HashMap<>();

        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit') : ");
            String info = scanner.nextLine();

            if (info.equals("exit")) {
                break;
            } else if (info.equals("search")) {
                System.out.print("검색 할 이름 : ");
                String name = scanner.nextLine();

                if (hmap.containsKey(name)) {
                    System.out.println(name + "씨의 전화번호 : " + hmap.get(name));
                } else {
                    System.out.println(name + "씨의 번호는 등록 되어 있지 않습니다.");
                }
            } else {
                String[] str = info.split(" ");
                if (str.length != 2) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                } else {
                    String name = str[0];
                    String phonenum = str[1];
                    hmap.put(name, phonenum);
                    System.out.println("추가 완료 : " + name + " " + phonenum);
                }
            }
        }
    }
    }
