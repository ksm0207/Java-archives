package backjoon05String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon07 {
    public static void main(String[] args) throws Exception{
        // 1. 단계 6 (Git) 문자열 - 2908번 상수 (상근이동생..)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        // 1. 두수를 입력받기
        int x = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int y = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());

        System.out.println( x > y ? x : y);
    }
}
