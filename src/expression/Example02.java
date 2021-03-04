package expression;

import java.util.Scanner;

public class Example02 {
    public static void main(String [] args){

        double width = 0.0; // 가로
        double height= 0.0; // 세로
        double area = 0.0;  // 면적
        double perimeter = 0.0; // 둘레

        Scanner scan = new Scanner(System.in);
        System.out.println("구하고자 하는 가로를 입력하세요 : ");
        width = scan.nextDouble();
        System.out.println("구하고자 하는 세로를 입력하세요 : ");
        height = scan.nextDouble();

        System.out.println("가로 길이 : " + width);
        System.out.println("세로 길이 : " + height);
        
        area = width * height;
        perimeter = 2.0 * (width + height);
        System.out.println("면적의 값은 " + area + "입니다");
        System.out.println("둘레의 길이는 " + perimeter + "입니다");
    }
}
