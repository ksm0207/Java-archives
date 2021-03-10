package part03;

import java.util.Scanner;

public class AlermExample {
    public static void main(String [] args) {

        int hValue = 0;
        int mValue = 0;
        int alerm = 45;



        Scanner scan = new Scanner(System.in);
        System.out.println("H 입력");
        hValue = scan.nextInt();

        System.out.println("M 입력");
        mValue = scan.nextInt();

        if (mValue < alerm) {
            hValue --;
            mValue = 60 - (alerm - mValue);
            System.out.println("" + hValue + " " + mValue);
            if (hValue < 0) {
                hValue = 23;
                System.out.println("!!" + hValue + "!!" + mValue);
            }else{
                System.out.println("Result  " + hValue + " " + mValue);
            }
        }else{
            System.out.println(" " + hValue + " " + mValue);
        }
    }
}
