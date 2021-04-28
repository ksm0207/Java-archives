package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon1427 {
    public static void main(String[] args) throws IOException {


        // 1. (Git) 단계별 : 정렬 - 1427번 소트인사이드

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        int input =  Integer.parseInt(b.readLine());

        // 자릿수 계산하기
        int n;

        int temp;

        n =0;
        temp = input;
        while(temp!=0) {
            n++;

            temp /= 10; // temp = temp / 10;
            System.out.println("Temp == " + temp);
        }

        // 배열 생성
        Integer [] A= new Integer[n];


        
        // 각 자릿수를 분해하기
        temp = input;
        System.out.println("Line : 36 Temp === " + temp);
        for(int i=A.length-1; i >= 0 ; i--) {
            A[i] = temp %10; // 배열의 맨 뒤에서부터, 입력받은 수의 제일 낮은 자리(1의자리수)를 나머지연산을 통해 저장.
            temp /= 10; // 10으로 나누어 10의자리수가 1의자리가 되도록 함.
            System.out.println("A[i] =========== " +A[i]);

        }
        System.out.println(2413 % 10); // 3
        System.out.println(241 % 10);  // 1
        System.out.println(24 % 10);  //  4
        System.out.println(2 % 10);   //  2

        System.out.println("======================");

        System.out.println(2413 / 10); // 3
        System.out.println(241 / 10);  // 1
        System.out.println(24 / 10);  //  4
        System.out.println(2 / 10);   //  2






        Arrays.sort(A ,Collections.reverseOrder());

        //출력
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i]);
        }

    }
}
