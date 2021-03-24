package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Backjoon04Final {
    public static void main(String [] args) throws Exception{

        // 1. 10개의 자연수를 입력받습니다
        // 2. 자연수 / 42 나누어서 이때 나머지가 다른 값이 몇개 있는지 출력하십시오
        // 3. 배열을 사용합니다

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        int [] arr = new int[10];

        for (int i = 0 ; i < arr.length ; i ++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
    }
}
