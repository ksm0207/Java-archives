package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SugarRe {
    public static void main(String[] args) throws Exception {
        // 1. 최소한 적은 봉지 개수를 구하기. (3kg 5kg 설탕봉지)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       System.out.println(14%5);
       System.out.println(1 /3 );
        int N = Integer.parseInt(br.readLine());

        if ( N == 4 || N == 7) {
            System.out.println(-1);
        }else if (N % 5 == 0) {
            System.out.println(N / 5);
        }else if(N % 5 == 1 || N % 5 == 3){
            System.out.println( (N / 5) + 1);
        }else if (N % 5 == 2 || N % 5 == 4) {
            System.out.println( (N / 5) +2    );
        }
    }
}
