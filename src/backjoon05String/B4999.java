package backjoon05String;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B4999 {
    public static void main(String[] args) throws IOException {
        // Git - 백준 4999 아! ( 분류 : 문자열 )

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String F = br.readLine();
        String S = br.readLine();

        if (F.length() < S.length()) {
            System.out.println("no");
        }else{
            System.out.println("go");
        }
    }
}
