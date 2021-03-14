package backjoon02;

import java.util.Scanner;

public class Backjoon08 {
    public static void main ( String [] args) {

        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int frist , second;
        String res = "";


        for (int i = 0 ; i < value ; i ++) {
            frist = scan.nextInt();
            second = scan.nextInt();
            res = res + "Case #" + (i + 1) + ": " + frist + " + "+ second + " = " + (frist + second) + "\n";
        }
        System.out.println(res);
    }
}
