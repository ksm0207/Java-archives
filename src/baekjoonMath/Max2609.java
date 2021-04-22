package baekjoonMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Max2609 {
    public static void main(String[] args)  throws IOException {
        // 1. (Git) 단계별 : 수학 - 2609번 최대공약수 와 최소공배수
        // 예제입력 : 24 18 || 예제출력 : 6 72

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int res = gcd(A,B);
        System.out.println(res);
        System.out.println(A * B / res);
    }
    public static int gcd(int a, int b){

        if (b == 0) {
            System.out.println("if return a");
            System.out.println(a);
            System.out.println(b);
            System.out.println("=============");

            return  a;
        }

        return gcd(b , a % b);
    }
}
