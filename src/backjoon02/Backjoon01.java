package backjoon02;

import java.util.Scanner;

public class Backjoon01 {
    public static void main(String [] args){

        int value =0;
        Scanner scan = new Scanner(System.in);
        value = scan.nextInt();

        for(int i = 1 ; i <= 9 ; i ++) {
            System.out.println(value + " * " + i + " = " + value * i);
        }
    }
}
