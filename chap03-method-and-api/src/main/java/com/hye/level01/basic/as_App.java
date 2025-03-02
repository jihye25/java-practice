package com.hye.level01.basic;

public class as_App {
    public static void main(String[] args) {

        Calculator as_cal = new Calculator();

        as_cal.checkMethod();

        System.out.println("1부터 10까지의 합 : " + as_cal.sum1to10());

        as_cal.checkMaxNumber(10, 20);

        System.out.println("10과 20의 합은 : " + as_cal.sumTwoNumber(10, 20));
        System.out.println("10과 5의 차는 : " + as_cal.minusTwoNumber(10, 5));

    }

}
