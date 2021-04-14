package example;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        final double MK = 0.45;
        Scanner scan = new Scanner(System.in);
        System.out.println("파운드 입력");
        int pound = scan.nextInt();
        double result = 0;

        result = pound * MK;
        System.out.println("밀가루 : " + result + "Kg 입니다 ");
    }
}
