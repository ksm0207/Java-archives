package part03;

import java.util.Scanner;

public class ArrayTest02 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        final int VALUE = scan.nextInt();
        int [] ar = new int [VALUE];


        System.out.println("입력 값 :  " + VALUE);
        for (int i = 0; i < ar.length; i ++) {
            ar[i] = i;
            System.out.println(ar[i]);
        }

    }
}
