package backjoon03;

import java.util.Scanner;

public class Backjoon01Final {
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in);
        int forCount = scan.nextInt();
        int value;
        int min = 0 ;
        int max = 0 ;

        for (int i = 0 ; i < forCount ; i ++) {
            value = scan.nextInt();

            if (max <= value) {
                max = value;
            }else{
                min = value;
            }
        }
        System.out.println(min + " "+max);
    }
}
