package backjoon03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon02 {
    public static void main(String [] args) throws IOException {
        // 9개의 자연수가 주어집니다
        // 이중 가장 최대값을 출력하고 몇번째 위치에 있는지 출력하십시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int count = 0;
        int indexOf = 0;
        int max = 0;

        int [] arr = new int [9];

        for (int i = 0 ; i < arr.length ; i ++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int result : arr) {
            count ++;
            if (result > max) {
                max = result;
                System.out.println( " MAX "  +max);
                indexOf = count;
            }else{
                System.out.println(" Result " + result);
            }
        }
        System.out.println("가장 큰 값 :" + max);
        System.out.println("위치 :" +  indexOf);
    }
}

