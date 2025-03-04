package com.hye.level02.normal;

import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //병합할 파일의 개수 입력 : 3
        //1 번째 파일 이름 입력 : test.txt
        //2 번째 파일 이름 입력 : test2.txt
        //3 번째 파일 이름 입력 : test3.txt
        //병합 될 파일명 입력 : result.txt
        //파일 병합이 완료 되었습니다.

        //===============================

        //병합할 파일의 개수 입력 : 2
        //1 번째 파일 이름 입력 : test.txt
        //2 번째 파일 이름 입력 : test4.txt
        //병합 될 파일명 입력 : result.txt
        //오류 : test4.txt (지정된 파일을 찾을 수 없습니다)


        Scanner sc = new Scanner(System.in);

        System.out.print("병합할 파일의 개수 입력 : ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            System.out.print((i+1) + "번째 파일 이름 입력 :");
            str[i] = sc.nextLine();
        }

        System.out.print("병합 될 파일명 입력 : ");
        String s = sc.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(s))) {
            for (int i = 0; i < str.length; i++) {
                try (BufferedReader br = new BufferedReader(new FileReader(str[i]))) {
                    String line;
                    while ((line = br.readLine())!= null){
                        writer.write(line);
                        writer.newLine();
                    }
                }
            }
            System.out.println("파일 병합이 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
