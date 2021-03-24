package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon06Re {
    public static void main(String [] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int forCount = Integer.parseInt(br.readLine());
        int countScore ,result;
        String [] arr = new String[forCount];

        for (int i = 0 ; i < arr.length; i ++) {
            arr[i] = String.valueOf(br.readLine());
        }
        for (int i = 0 ; i < forCount ; i ++) { // forCount로 발생시킨 반복문 횟수만큼 진행

            // for 반복문이 실행될때마다 0으로 초기화 되면서 연산
            countScore = 0;
            result = 0;

            for (int j = 0; j < arr[i].length(); j ++) { // arr[i].length()는 배열의 데이터 길이를 반환
//                System.out.println(arr[i].length());

                // 배열에 담긴 데이터중에 O 가 있는지 체크
                if (arr[i].charAt(j) == 'O') {
                    // 존재하는 만큼 countScore를 증감
                    countScore++;
                } else {
                    countScore = 0;
                }
                result = result + countScore;
            }
            System.out.println(result);
        }
    }
}
