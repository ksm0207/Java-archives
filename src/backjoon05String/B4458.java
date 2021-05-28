package backjoon05String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4458 {
    public static void main(String[] args) throws IOException {
        // Git - 백준 4458 첫 글자를 대문자로 ( 분류 : 문자열 )
        // Hint : toCharArray() upperCaseFirst()
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < count ; i ++) {
            String S = br.readLine();
            String res = upperCaseFirst(S);
            System.out.println(res);
        }
    }
    public static String upperCaseFirst(String s) {
        char [] arr =  s.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);

        return new String(arr);
    }
}
