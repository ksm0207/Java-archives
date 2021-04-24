package baekjoonImplement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeNumber {
    public static void main(String[] args) throws Exception {
        // 1. (Git) 단계별 : 구현 - 10817번 세 수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 입력할 때 두 번째로 큰 정수를 출력함

        // 경우의 수 1 : 20 30 10 -- > 10 다음 20이 큰수 20 출력
        // 경우의 수 2 : 30 30 10 -- > 10 다음 30이 큰수 30 출력
        // 경우의 수 3 : 40 40 40 -- > 40 출력
        // 경우의 수 4 : 20 10 10 -- > 10 출력

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int [] arr = {A , B , C};

        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}
