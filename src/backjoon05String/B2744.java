package backjoon05String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2744 {
    public static void main(String[] args) throws IOException {
        // Git - 백준 2744 대소문자 바꾸기 ( 분류 : 문자열 )

//        WrongAnswer
//        wRONGaNSWER
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        // 문자열 저장 (char)
        char[] arr = S.toCharArray();

//      Hint : A에서 a로 만드려면 32를 더하고 반대의 경우는 빼면 된다.
        for (int i = 0 ; i < arr.length ; i ++ ) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }else{
                if ('a' <= arr[i] && arr[i] <= 'z') {
                    arr[i] = (char) (arr[i] - 32);
                }
            }
        }
        System.out.println(arr);
    }
}
