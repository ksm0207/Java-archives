package backjoon03;

import java.util.Arrays;
import java.util.Scanner;

public class Backjoon01 {
    public static void main ( String [] args) {

        Scanner scan = new Scanner(System.in);
        final int size  = scan.nextInt();
        int [] array = new int[size];

        for (int i = 0 ; i < array.length ; i ++) {
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[size -1]);
    }
}

// 메모리 327984 KB
// 시간   2356ms

