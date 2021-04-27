package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon03 {
    public static void main(String[] args) throws Exception {
        // 1. (Git) 단계별 : 정렬 - 10989번  수 정렬하기 3

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int index = Integer.parseInt(b.readLine());
        int [] array = new int [index];

        for (int i = 0; i < array.length ; i ++) {
            array[i] = Integer.parseInt(b.readLine());
        }
        Arrays.sort(array);

        for (int result : array) {
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
