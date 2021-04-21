package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws Exception {

        // 1. (Git) 단계별 : 수학 - 10872번 팩토리얼
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 1;

        for (int i = 1 ; i <= N ; i ++) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
