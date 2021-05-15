package baekjoonMath2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class B2455 {
    public static void main(String[] args) throws Exception {
        // Git - 백준 2455 지능형 기차 ( 분류 : 사칙연산 )
        Scanner scan = new Scanner(System.in);

        int people = 0;
        int maxTotal = 0;

        for (int i = 0; i < 4; i++) {
            int train1 = scan.nextInt();
            int train2 = scan.nextInt();

            people = (people) - (train1) + train2;
            maxTotal = Math.max(people,maxTotal);
        }
        System.out.println(maxTotal);
    }
}
