package backjoon02;

import java.util.Scanner;

public class Backjoon02 {
    public static void main ( String [] args){

        int a = 0;
        int b = 0;
        int count = 0;

        Scanner scan = new Scanner(System.in);
        count = scan.nextInt();

        for (int i = 1 ; i <= count ; i ++) {
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println(a + b);
        }
    }
}
