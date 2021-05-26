package backjoon05String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10808 {
    public static void main(String[] args) throws IOException {
        // Git - 백준 10808 알파벳 개수 찾기 ( 분류 : 문자열 )

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int [] alpha = new int[26];

        for (int i = 0 ; i < alpha.length; i ++) {
            alpha[i] = 0;
        }

        for (int i = 0 ; i < S.length() ; i ++) {
            // 알파벳이 등장할 때 마다 카운트
            alpha[S.charAt(i)- 'a'] ++;
        }
        for (int res : alpha){
            System.out.println(res);
        }
    }
}
