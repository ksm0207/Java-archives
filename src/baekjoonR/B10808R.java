package baekjoonR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10808R {
    public static void main(String[] args) throws Exception {
        // Git - 백준 10808 알파벳 개수 ( 분류 : 문자열 )
        // Hint : 알파벳이 등장할 때 마다 카운트 시키기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        // 1.  알파벳 개수 배열에 저장
        int [] alpha = new int[26];

        // 2. 알파벳 개수 0 으로 초기화
        for (int i = 0 ; i < alpha.length ; i ++) {
            alpha[i] = 0;
        }

        // 3. 알파벳 등장할 때 마다 카운트
        for (int i = 0 ; i < S.length(); i ++) {
            alpha[S.charAt(i) - 'a']++;
        }
        for (int res : alpha) {
            System.out.println(res);
        }
    }
}
