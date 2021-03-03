package expression;

import java.util.Scanner;

public class ScannerExample03 {
    public static void main(String [] args){

        int age = 0;
        String name = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("당신의 이름은 ? : ");
        name = scan.next();
        System.out.println("나이를 입력하세요 : ");
        age = scan.nextInt();

        System.out.println("안녕하세요  " + name + " 님 " + age + "살 이시네요 ");
    }
}
