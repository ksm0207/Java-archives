package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon01R {
    public static void main(String[] args) throws Exception {

        // 1. 단계 6 (Git) 문자열 - 11654 번 아스키 코드 출력하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int input = br.readLine().charAt(0);
            System.out.println(input);
        }catch (Exception error){
            System.out.println(error);
            System.out.println(error.getMessage());
        }
    }
}
