package com.company;

// Scanner를 사용하기 위해 import를 통해 외부클래스를 호출
import java.util.Scanner;

public class Constant {
    public static void main(String [] args){

        // 1마일 1.60934 킬로미터로 정의
        final double ONE_MILE = 1.60934;
        // 킬로미터 / 마일 변수 정의
        double km = 0.0;
        double mile = 0.0;

        // Scanner 객체 생성 ( 입력 받기 위한 단계 1 )
        Scanner scan = new Scanner(System.in); // System.in은 입력한 값을 바이트 단위로 읽게 만들기
        System.out.print("Mile 입력 : ");
        mile = scan.nextDouble(); // next() 메소드는 공백 이전까지의 문자열 입력을 받습니다

        System.out.println((int)mile+ "마일은 "+ mile * ONE_MILE + " 킬로미터 입니다");
    }
}
