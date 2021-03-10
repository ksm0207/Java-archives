package backjoon01;

import java.util.Scanner;

public class Example03 {
    public static void main (String [] args){

        int a = 0;
        int b = 0;
        int c = 0;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        System.out.println( (a + b) % c );
        System.out.println( ((a % c + (b % c)) % c));
        System.out.println( (a * b) % c );
        System.out.println( ((a % c) * (b % c)) % c );






    }
}
