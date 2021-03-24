package Blog_part02;

import java.util.Scanner;

public class WhileExample03 {
    public static void main(String [] args){

        int number =0;
        int sum = 0;
        int value = 1;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("입력한 값 까지 정수 값 입력 하기 : ");
        number = scan.nextInt();

        while (value <= number){ // 1 <= 입력한 값이 작거나 같을때까지 진행
            sum = sum + value; // 0 + 1로 처음 반복문 시작
            value ++; // 조건이 true 만큼 증가
            count ++;
            System.out.println(" 실행횟수 "+ count  + " SUM "+ sum +  " + "  + "VALUE " + value);
        }
        System.out.println("입력한 값 " + number + " 의 "+ " 총합은 = "+sum + "입니다");
    }
}
