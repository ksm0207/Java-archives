package backjoon05String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReTry10987 {
    public static void main(String[] args) throws Exception {
        // 다시 풀기
        // Git - 백준 10987 모음의 개수 ( 분류 : 문자열 )
        // 모음의 개수 = a e i o u

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int sum = 0;

        for (int i = 0 ; i < S.length() ; i ++ ) {
            char ch = S.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u'  ) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
}
