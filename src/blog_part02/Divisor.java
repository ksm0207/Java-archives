package blog_part02;

import java.util.Scanner;

public class Divisor {
    public static void main(String [] args){

        int value = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 n을 입력하세요 ");

        value = scan.nextInt();
        System.out.println(value + " 의 약수 결과");

        for (int i = 1 ; i <= value ; i ++) {

            if (value % i == 0) {
                System.out.println("Value == "+value);
                System.out.println("I == "+i);
            }
        }
    }
}
