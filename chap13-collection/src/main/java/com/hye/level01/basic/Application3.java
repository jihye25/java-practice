package com.hye.level01.basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 유관순
//유관순 고객님 대기 등록 되었습니다.
//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 홍길동
//홍길동 고객님 대기 등록 되었습니다.
//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//유관순 고객님 차례입니다.
//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): 신사임당
//신사임당 고객님 대기 등록 되었습니다.
//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//홍길동 고객님 차례입니다.
//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//신사임당 고객님 차례입니다.
//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): next
//대기 고객이 없습니다.
//대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): exit

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> linkedList = new LinkedList<>();

        while (true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit') : ");
            String name = scanner.nextLine();

            if (name.equals("exit")) {
                break;
            } else if (name.equals("next")) {
                if (linkedList.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    System.out.println(linkedList.get(0) + " 고객님 차례입니다.");
                    linkedList.remove(0);
                }
            }
                else {
                linkedList.add(name);
                System.out.println(name + " 고객님 대기 등록 되었습니다.");
            }

        }
    }
}