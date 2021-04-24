package baekjoonImplement;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TenLength11721 {
    public static void main(String[] args) throws IOException {
        // 1. (Git) 단계별 : 구현 - 11721번 열 개씩 끊어 출력하기
        // BaekjoonOnlineJudge
        //    10        10
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        for (int i = 0 ; i < str.length(); i ++) {
            System.out.print(str.charAt(i));
            if (i % 10 == 9)
                System.out.println();
        }
    }
}
