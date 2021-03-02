package com.company;

public class AreaExample {
    public static void main(String [] args){
        double area = 0.0; // 면적
        double radius = 5.0; // 지름

        // 원 면적 공식 : 반지름 * 반지름 * 파이
        area = radius * radius * 3.14;
        System.out.println("원의 면적은 : "+ area + " 입니다");
    }
}
