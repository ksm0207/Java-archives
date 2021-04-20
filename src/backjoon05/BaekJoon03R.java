package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon03R {
    public static void main(String[] args) throws Exception {

        // 1. 단계 6 (Git) 문자열 - 10809번 알파벳 찾기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int [] arr = new int[26];

        // *************************************
        //  알파벳 26개를 -1로 초기화
        for (int i = 0 ; i < arr.length; i ++) {
            arr[i] = -1;
        }
        // *************************************


        // *************************************
        // 입력 단어 S.length() 길이만큼 반복
        for (int i = 0 ; i < S.length(); i ++) {
            // baekjoon 찾고 반환
            char find = S.charAt(i);

            // ===================================================================
            // [0] [1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14]
            //  a   b   c   d   e   f   g   h   i   j   k   l    m     n    o
            //  0   1   -1  -1  2  -1   -1  -1  -1  3   4   -1   -1    5    6
            // ===================================================================
            // baekjoon input
            // 1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5
            // b a       e             k j      oo n
            if (arr[find - 'a']  == -1) {
                arr[find - 'a'] = i;
                System.out.println(find +" : "+ (find - 'a') + "  >>>>>>>>>>  " +  arr[find - 'a' ]);
            }
        }
        // *************************************

        for (int res : arr){
//            System.out.println(res);
        }
    }
}
