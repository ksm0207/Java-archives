package expression;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("문장을 입력하세요 : ");
        String str = scan.nextLine();
        System.out.println("입력하신 결과는 " + str + "입니다");
    }
}
