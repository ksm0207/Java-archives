package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Backjoon04Re {
    public static void main(String [] args) throws Exception{

        // 1. 배열을 사용합니다.
        // 2. 자연수 10개를 입력받습니다.
        // 3. 그 후 42로 나눈 나머지를 구합니다.
        // 4. 서로 나머지 값이 다른것은 몇개 인지 출력하십시오.

        int [] arr = new int [10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0 ; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
            hs.add(arr[i]);
        }
        System.out.println(hs.size());

    }
}
