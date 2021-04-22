package baekjoonMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SafariWorldR {
    public static void main(String[] args) throws IOException {

        // 1. ( | N - M | ) - 절대 값 구하는 문제..

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        long N = Long.parseLong(st.nextToken());
        long M = Long.parseLong(st.nextToken());
        long abs = N - M;
        System.out.println(Math.abs(abs));
    }
}
