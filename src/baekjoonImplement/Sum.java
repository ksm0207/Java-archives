package baekjoonImplement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args)  throws Exception{
        // 1. (Git) 단계별 : 구현 - 2747번 파보나치 수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = 0; // 첫번째
        int b = 1; // 두번째
        int sum = 0 ; // 두 수의 합

        int N = Integer.parseInt(br.readLine());


            for (int i = 2 ; i <= N ; i ++) {
                sum = a + b;
                a = b;
                b = sum;
//                System.out.println( " i " + i + " = " + " a = b " + a + " B = sum " + b);
            }
            System.out.println(sum);

    }
}
