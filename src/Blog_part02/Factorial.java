package Blog_part02;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        
        // 팩토리얼 값 구하기
        
        int value = 0;
        long sum = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 입력 : ");
        value = scan.nextInt();
        
        for (int i = 1 ; i <= value ; i ++) {
            sum = sum * i; // 1 x 2 x 3 x 4 x ...
        }
        System.out.println("입력한" + value + "!의 팩토리얼 값은\n" + sum + " 입니다");
    }
}
