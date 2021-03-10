package backjoon01;

import java.util.Scanner;

public class Operations {
    public static void main(String [] args){

        int num = 0;
        int num2 =0;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        num2 = scan.nextInt();

        System.out.println(num + num2);
        System.out.println(num - num2);
        System.out.println(num * num2);
        System.out.println(num / num2);
        System.out.println(num % num2);


    }
}
