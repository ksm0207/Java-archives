package backjoon02;

import java.util.Scanner;

public class Example {
    public static void main(String [] args) {

        // 1 정수 N개로 이루어진 수열 A 와 정수 X가 주어집니다
        // 2 이번에는 A 에서 X 보다 큰 수를 모두 출력하는 프로그램을 작성하십시오
        // 3 StringBuilder 을 사용합니다

        Scanner scan = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();


        int n = scan.nextInt();
        int x = scan.nextInt();
        int value;

        for (int i = 0 ; i < n ; i ++) {

            value = scan.nextInt();
            if (value < x){
                sb.append(" "+value);
            }
        }
        System.out.print(sb.substring(1));
    }
}
