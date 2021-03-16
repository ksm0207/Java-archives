package blog_part02;

import java.util.Scanner;

public class ForExample01 {
    public static void main ( String [] args){

        // for 문을 이용하여 사용자가 입력한 정수값을 0부터 n 까지의 수를 출력하기
        int value = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 값 입력 하기 : ");
        value = scan.nextInt();

        for (int i = 0 ; i <= value ; i ++ ){
            System.out.println("결과 : " + i);
        }
    }
}
