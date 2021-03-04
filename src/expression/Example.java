package expression;

import java.util.Scanner;

public class Example {
    public static void main (String [] args){

        double radius = 0.0; // 원의 반지름
        double area = 0.0; // 원의 면적

        Scanner scan = new Scanner(System.in);
        System.out.println("반지름을 입력하세요 : ");

        radius = scan.nextDouble();
        area = 3.14 * radius * radius;

        System.out.println("입력한 값 : " + radius);
        System.out.println("radius 제곱값 : " + radius * radius);
        System.out.println("원의 면적은 : " + area + " 입니다 ");
    }
}
