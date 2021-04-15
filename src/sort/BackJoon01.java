package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BackJoon01 {
    public static void main(String[] args) throws IOException {
        // 1. 수 정렬하기 - 2750번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0 ; i < testCase; i ++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);

        for (int res : list) {
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
}
