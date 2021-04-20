package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon03R {
    public static void main(String[] args) throws Exception {

        // 1. 단계 6 (Git) 문자열 - 10809번 알파벳 찾기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int [] arr = new int[26];
        for (int i = 0 ; i < arr.length; i ++) {
            arr[i] = -1;
        }

        for (int i = 0 ; i < S.length(); i ++) {
            char find = S.charAt(i);

            if (arr[find - 'a']  == -1) {
                arr[find - 'a'] = i;
            }
        }
        for (int res : arr){
            System.out.println(res);
        }
    }
}
