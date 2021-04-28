package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BaekJoon1427Re {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1. 정수 자릿수 계산
        int N = Integer.parseInt(br.readLine()); // 2143
        int divCount = 0, copyValue ;

        copyValue = N;

        while (copyValue != 0){
            copyValue /= 10;
            divCount ++;
        }


        Integer [] index = new Integer [divCount];

        copyValue = N;


        for (int i = 0 ; i < index.length ; i ++) {
            index[i] = copyValue % 10;
//            System.out.println(index[i]);
            copyValue /= 10;
        }
        Arrays.sort(index,Collections.reverseOrder());

        for (int i = 0 ; i < index.length ; i ++) {
            System.out.println(index[i]);
        }

    }
}
