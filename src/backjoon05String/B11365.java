package backjoon05String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11365 {

    public static void main(String[] args) throws IOException {
        // Git - 백준 11365번 !밀비 급일 ( 분류 : 문자열 )
        // Hint : StringBuffer

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb;
        while (true) {
            String S = br.readLine();
            sb = new StringBuffer(S);
            sb.reverse();
            if (S.equals("END")) {
                break;
            }else{
                System.out.println(sb);
            }
        }
    }
}
