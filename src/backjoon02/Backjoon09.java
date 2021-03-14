package backjoon02;

import java.util.Scanner;

public class Backjoon09 {
    public static void main ( String [] args) {
        Scanner scan = new Scanner(System.in);
        int count;
        count = scan.nextInt();
        
        // for 문으로 별 찍기 문제

        for (int i = 1 ; i <= count ; i ++) {
            for (int j = 1 ; j <= i ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

