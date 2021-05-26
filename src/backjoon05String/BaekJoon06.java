package backjoon05String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon06 {
    public static void main(String[] args)  throws Exception{
        // 1. 단계 6 (Git) 문자열 - 1152번 단어의 개수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] S = br.readLine().split(" ");
        int count =0;

        for (int i = 0 ; i < S.length; i ++) {
            try{
                char find = S[i].charAt(0);
                count ++;
            }catch (Exception error) {
            }
        }
        System.out.println(count);
    }
}




