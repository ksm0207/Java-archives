package backjoon01;

import java.util.Scanner;

public class DivInput {
    public static void main(String [] args){

        double fValue = 0.0;
        double sValue = 0.0;

        Scanner scan = new Scanner(System.in);
        fValue = scan.nextDouble();
        sValue = scan.nextDouble();

        System.out.println(fValue / sValue);
    }
}
