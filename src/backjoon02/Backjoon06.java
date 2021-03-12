package backjoon02;

import java.util.Scanner;

public class Backjoon06 {
    public static void main ( String [] args) {

        // 자연수 N이 주어졌을때 N 부터 1까지 한줄에 하나씩 출력하기
        // 출력은 5 4 3 2 1 역순으로 출력하기

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int i = 0;
        int sum = 0;

        while (i < num ){
            i ++;
            sum = i;


            if (sum == num) {
               sum = sum - i;
            }
            System.out.println(sum);
        }

    }
}
