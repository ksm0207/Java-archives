package expression;

import java.util.Scanner;

public class BackJoonExample {
    public static void main(String [] args){

        int f_value = 0;
        int s_value = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("두 자연수 A 와 B 를 입력하세요 : ");
        f_value = scan.nextInt();
        s_value = scan.nextInt();

        System.out.println(f_value + s_value);
        System.out.println(f_value - s_value);
        System.out.println(f_value * s_value);
        System.out.println(f_value / s_value);
        System.out.println(f_value % s_value);
    }
}
