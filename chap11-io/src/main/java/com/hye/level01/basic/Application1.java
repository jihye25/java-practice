package com.hye.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("원본 파일의 이름을 입력하세요 :");
        String fileName = sc.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 :");
        String CopyFileName = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(CopyFileName))) {
            String sen;
            while ((sen = reader.readLine()) != null) {
                writer.write(sen);
            }

            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}

