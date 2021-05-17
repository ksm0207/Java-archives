package baekjoonR;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2744R {

    public static void main(String[] args)  throws Exception{
        // Git - 백준 2744 대소문자 바꾸기 ( 분류 : 문자열 )
        //      Hint : A에서 a로 만드려면 32를 더하고 반대의 경우는 빼면 된다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String S = br.readLine();
        char[] arr = S.toCharArray();

        for (int i = 0 ; i < arr.length; i ++) {

            // 1. 대문자를 소문자로 바꿔준다.
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] + 32);
            }else {
                // 2. 소문자를 대문자로 바꿔준다.
                if ('a' <= arr[i] && arr[i] <= 'z') {
                    arr[i] = (char) (arr[i] -32);
                }
            }
        }
        System.out.println(arr);
    }
}
