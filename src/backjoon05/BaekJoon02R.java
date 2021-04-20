package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon02R {
    public static void main(String[] args) throws Exception {

        // 1. 단계 6 (Git) 문자열 - 11720번 숫자의 합

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int sum = 0 ;
        String val = String.valueOf(br.readLine());

        for (int i = 0 ; i < count; i ++) {

//            System.out.println("for i     ==============>" + i );
//            System.out.println("CharAt(i) ==============>" + val.charAt(i) );
            sum = sum + val.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
