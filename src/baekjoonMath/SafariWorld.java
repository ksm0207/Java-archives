package baekjoonMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.logging.Logger;

public class SafariWorld {
    public static void main(String[] args) throws IOException {

        // 1. (Git) 단계별 : 수학 - 2420번 사파리월드
        
        // ※ (|N-M|) 의 차이를 구한다 -2 5 의 차이는 7
        // -2 1 0 1 2 3 4 5
        //    1 2 3 4 5 6 7

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long result = N - M;

        System.out.println(Math.abs(result));
    }
}
