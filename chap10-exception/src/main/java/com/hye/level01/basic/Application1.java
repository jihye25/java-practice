package com.hye.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 2
         *
         * ----- 출력 예시 -----
         *
         * 결과 : 5
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 십
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 유효한 정수를 입력하세요.
         * 실행이 완료되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * 분자 입력 : 10
         * 분모 입력 : 0
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 0으로 나누는 것은 허용되지 않습니다.
         * 실행이 완료되었습니다.
         */

        Scanner scanner = new Scanner(System.in);


        System.out.print("분자 입력 : ");
        while (!scanner.hasNextInt()) {
            System.out.println("오류 : 유효한 정수를 입력하세요.");
            scanner.next();
            System.out.print("분자 입력 : ");
        }
        int nu = scanner.nextInt();

        System.out.print("분모 입력 : ");
        while (!scanner.hasNextInt()) {
            System.out.println("오류 : 유효한 정수를 입력하세요.");
            scanner.next();
            System.out.print("분모 입력 : ");
        }
        int den = scanner.nextInt();

        if (den == 0) {
            System.out.println("오류 : 0으로 나누는 것은 허용되지 않습니다.");
        } else {
            int result = nu / den;
            System.out.println("결과 : " + result);
        }
        System.out.println("실행이 완료되었습니다.");
        scanner.close();
        }
    }


