package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BackJoon03Re {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] arr = new int[26];
        int count = 0;

        // 배열 -1 로 초기화 --> 존재하지 않는 알파벳이 있다면 초기화 하기.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }

        // 알파벳은 소문자로 이루어진 단어 S 가 주어진다.
        String S = br.readLine();

        // 위치는 (i)  0번째 부터 시작
        // a = 0 번째 b = 1 번째
//        baekjoon
        for (int i = 0; i < S.length(); i++) {
            // 아스키코드 값 a는 97 b 는 98 ..
            char check = S.charAt(i);
            count ++;
            System.out.println("for 문 시작 횟수 :  " + count  );
            System.out.println("내가 입력한 문자열 : " + check);
            System.out.println("chatAt(i) - 'a' Result --> " + check + " - " + " a ");
            System.out.println(check - 'a');

            if (arr[check - 'a'] == -1) { // 배열 원소 값이 -1 인 경우에만 초기화
                arr[check - 'a' ] = i;
                System.out.println("결과 ");
                System.out.println(check +" : "+(check - 'a') + ">>>>>>>>>>" + arr[check - 'a' ]);
                System.out.println("=====================================================\n");
            }
        }
        for (int res : arr) {
            System.out.println(res + " ");
        }
    }
}
