package baekjoonMath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon1934 {
    public static void main(String[] args)  throws Exception{

        // 1. (Git) 단계별 : 수학 - 1934번 최소공배수
        // 유클리드 호제법 으로 풀이하기.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int testCase = Integer.parseInt(br.readLine());
        int res;
        for (int i = 0 ; i < testCase ; i ++) {
            st = new StringTokenizer(br.readLine() , " ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            res = gcd(A,B);
            System.out.println(A * B / res);
        }
    }
    public static int gcd (int a , int b) {

        if (b == 0) {

            return a;
        }
        return gcd(b , a % b);
    }
}
