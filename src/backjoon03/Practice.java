package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice {
    public static void main (String [] args) throws Exception{

        // 최소값 최대값 출력하기
        // 배열 이용
        // 테스트 케이스 : 5
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());
        int [] arr = new int [value];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0 ; i < arr.length ; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        System.out.println("최소 값 : " + arr[0] + "최대 값 : " + arr[value-1]);

    }
}
