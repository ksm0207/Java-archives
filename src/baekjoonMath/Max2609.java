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

        System.out.println("A Input = " + A);
        System.out.println("B Input = " + B);


        int res = gcd(A,B);

        System.out.println(" 최소공약수 = " +res);
        System.out.println(" 최소공배수 = " + A * B / res);
    }
    public static int gcd(int a, int b){

        if (b == 0) {
            System.out.println("=============");
            System.out.println("if return a");
            System.out.println( " A " +a);
            System.out.println( " B " +b);
            System.out.println("=============");

            return  a; // 최소공약수 return
        }
        System.out.println("Result = " + b + " " +  a % b);

        return gcd(b , a % b);
    }
}
