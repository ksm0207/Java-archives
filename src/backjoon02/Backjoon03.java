package backjoon02;

import java.util.Scanner;

public class Backjoon03 {
    public static void main(String [] args){
        
        // for - 합 구하기

        int num = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        num = scan.nextInt();

        for (int i = 1 ; i <= num ; i ++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
