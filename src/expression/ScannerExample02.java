package expression;

import java.util.Scanner;

public class ScannerExample02 {
    public static void main(String [] args){
        int number = 0;
        int number2 = 0;
        int result =0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하세요 :");
        number = scan.nextInt();
        System.out.println("두번째 숫자를 입력하세요: ");
        number2 = scan.nextInt();
        
        result = number + number2; // 첫번째 정수 두번째 정수 합 저장
        
        System.out.println("결과는 " + result + "입니다");
        

    }
}
