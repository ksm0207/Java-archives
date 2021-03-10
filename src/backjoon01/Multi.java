package backjoon01;

import java.util.Scanner;

public class Multi {
    public static void main (String [] args){
        int fValue = 0;
        int sValue = 0;
        Scanner scan = new Scanner(System.in);

        fValue = scan.nextInt();
        sValue = scan.nextInt();

        System.out.println(fValue * (sValue % 10));
        System.out.println(fValue * (sValue % 100 / 10));
        System.out.println(fValue * (sValue / 100));
        System.out.println(fValue * sValue);
    }
}
