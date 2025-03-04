package com.hye.level01.basic;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//학생 성적 : 100
//추가 입력하려면 y : y
//학생 성적 : 95
//추가 입력하려면 y : Y
//학생 성적 : 66
//추가 입력하려면 y : y
//학생 성적 : 79
//추가 입력하려면 y : n
//학생 인원 : 4
//평균 점수 : 85.0

public class Application1 {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 성적 : ");
        int grade = scanner.nextInt();


        String enter;
        scanner.nextLine();

        int sum = 0;




        while(true){
        System.out.print("추가 입력하려면 y : ");
//      String
              enter = scanner.nextLine();
            sum += grade;
            linkedList.add(Integer.toString(grade));
            double avg = (double)sum /linkedList.size();
        if(enter.equalsIgnoreCase("y")) {
            System.out.print("학생 성적 : ");
             grade = scanner.nextInt();
            scanner.nextLine();

        }else{

            System.out.println("학생 인원 : " + linkedList.size());
            System.out.println("평균 점수 : " + avg);
            break;
        }

    }

}
}

