package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class BackJoon01Re {
    public static void main(String[] args) throws Exception {

        // 1. 수 정렬하기 - 2750번 BufferedReader 이용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        int testCase = Integer.parseInt(br.readLine());
        int [] arr = new int[testCase];

        for (int i = 0 ; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(br.readLine());
            hs.add(arr[i]);
        }

        ArrayList<Integer> list = new ArrayList<>(hs);
        Collections.sort(list);

        for (int res : list) {
            System.out.println(res);
        }
    }
}
