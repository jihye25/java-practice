package com.hye.level01.basic.student.run;

import com.hye.level01.basic.student.modle.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
// while문을 사용하여 학생들의 정보를 계속 입력 받고
// 한 명씩 추가 될 때마다 카운트함
// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
// 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
// 현재 기록된 학생들의 각각의 점수 평균을 구함
// 학생들의 정보를 모두 출력 (평균 포함)

//
//        학년 : 1
//        반 : 5
//        이름 : 홍길동
//        국어점수 : 40
//        영어점수 : 60
//        수학점수 : 70
//        계속 추가할 겁니까 ? (y/n) : y
//        학년 : 2
//        반 : 1
//        이름 : 김말똥
//        국어점수 : 70
//        영어점수 : 80
//        수학점수 : 100
//        계속 추가할 겁니까 ? (y/n) : y
//                ----- 입력 생략 -----
//                계속 추가할 겁니까 ? (y/n) : n
//                학년=1, 반=5, 이름=홍길동, 국어=40, 영어=60, 수학=70, 평균=56
//        학년=2, 반=1, 이름=김말똥, 국어=70, 영어=80, 수학=100, 평균=83
//        학년=3, 반=3, 이름=강경순, 국어=100, 영어=75, 수학=86, 평균=87



        Scanner sc = new Scanner(System.in);

        StudentDTO[] arr = new StudentDTO[10];
        int studentcount = 0 ;

        char ch=' ';


        while (studentcount<10){

        System.out.print("학년 : ");
        int grade = sc.nextInt();
        System.out.print("반 : ");
        int classroom = sc.nextInt();
        sc.nextLine();

        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("국어점수 : ");
        int kor = sc.nextInt();
        System.out.print("영어점수 : ");
        int eng = sc.nextInt();
        System.out.print("수학점수 : ");
        int math = sc.nextInt();
        sc.nextLine();

        arr[studentcount] = new StudentDTO(grade, classroom, name, kor, eng, math);
        studentcount ++;

        System.out.print("계속 추가할 겁니까 ? (y/n) : ");
        ch = sc.next().charAt(0);
        sc.nextLine();

        if (ch == 'n'){
            break;
        }
        }
        for(int i = 0; i < studentcount; i++) {
           int avg = (arr[i].getKor() + arr[i].getEng() + arr[i].getMath()) / 3;
            System.out.println(arr[i].getInformation() + ", 평균=" + avg);
        }


    }

}
