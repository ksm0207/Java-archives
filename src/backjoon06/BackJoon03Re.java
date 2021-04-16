package backjoon06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BackJoon03Re {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        int copyValue = N; // 원래 수 로 돌아오면 반복문 종료시키는 변수

        // 1. (N % 10) * 10 = 60 || N 정수의 1의 자리는 새로운 수 10의 자리로 간다
        System.out.println( (N % 10) * 10);
        // 2. N의 1의 자리수 와 10의 자릿수를 더한 값의 1의 자릿수는 새로운 1의 자릿수가 된다
        System.out.println( ( (N % 10) * 10) +  ( (N / 10 ) +  (N % 10)  ) % 10 );
        while (true) {
            N = ( (N % 10) * 10) +  ( (N / 10 ) +  (N % 10)  ) % 10;
            count ++;
            System.out.println("Count ==== >" + count);
            System.out.println("N ==== >" + N);
            if (N == copyValue) {
                break;
            }
        }
        System.out.println(count);
    }
}
