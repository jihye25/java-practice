package com.hye.level02.nomal.book.run;

import com.hye.level02.nomal.book.model.dto.BookDTO;

import java.awt.print.Book;

public class Application {
    public static void main(String args[]) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력


//        null, null, null, 0, 0.0
//        자바의 정석, 도우출판, 남궁성, 0, 0.0
//        홍길동전, 활빈당, 허균, 5000000, 0.5

        BookDTO[] bookDTOArray = new BookDTO[3];
        bookDTOArray[0] = new BookDTO();
        bookDTOArray[1] = new BookDTO("자바의 정석","도우출판", "남궁성", 0, 0);
        bookDTOArray[2] = new BookDTO("홍길동전", "활빈당","허균",5000000,0.5);

        for(int i= 0 ; i<3;i++){
            bookDTOArray[i].printInformation();
        }

    }
}
