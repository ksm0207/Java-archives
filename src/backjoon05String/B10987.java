package backjoon05String;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10987 {
    public static void main(String[] args) throws Exception {
        // Git - 백준 10987 모음의 개수 ( 분류 : 문자열 )
        // 모음의 개수 = a e i o u
        // 단어를 입력하여 모음 의 개수를 출력하기. (소문자 입력)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //                  b   a   e   k   j  o  o  n (Inout)
        //                  0   1 + 1 + 0 + 0 +1 +1 +0 ..(Operations)
        //                  Result = 4 ( Output)
        String S = br.readLine();
        int sum = 0;
        for (int i = 0 ; i < S.length(); i ++) {

            if (S.charAt(i) == 'a' || S.charAt(i) == 'e' ||
                S.charAt(i) == 'i' || S.charAt(i) == 'o' ||
                S.charAt(i) == 'u') {

                sum ++;
            }
        }
        System.out.println(sum);
    }
}
