package Blog_part02;

import java.util.Scanner;

public class EvenOadd {
    public static void main(String [] args){

        int number =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요 : ");
        number = scan.nextInt();
        
        if (number % 2 == 0 ){
            System.out.println(number+"... 결과는 짝수 입니다");
        }else{
            System.out.println(number+"... 결과는 홀수 입니다");
        }
        scan.close();
        System.out.println("시스템 종료 ..");

    }
}
