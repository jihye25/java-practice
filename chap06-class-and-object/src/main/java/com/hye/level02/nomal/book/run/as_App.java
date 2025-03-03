package com.hye.level02.nomal.book.run;

import com.hye.level02.nomal.book.model.dto.as_dto;

public class as_App {
    public static void main(String[] args) {

        as_dto b1 = new as_dto();
        b1.printInformation();

        as_dto b2 = new as_dto("자바의 정석", "도우출판", "남궁성");
        b2.printInformation();

        as_dto b3 = new as_dto("홍길동전", "활빈당", "허균", 5000000, 0.5);
        b3.printInformation();

    }
}
