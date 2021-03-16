package blog_part02;

import java.util.Scanner;

public class WhileExample02 {
    public static void main(String [] args){

        // while 문을 이용하여 구구단 프로그램 만들기

        int number = 0; // 왼쪽 연산자
        int add_value = 1; // 오른쪽 연산자
        Scanner scan = new Scanner(System.in);
        System.out.println("구구단 출력하기 : ");
        number = scan.nextInt();


        while (add_value <= 9){
            System.out.println(number + "x" + add_value + "=" + number * add_value);
            add_value ++;
        }
    }
}
