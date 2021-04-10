package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BackJoon01Final {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrList = new ArrayList<Integer>();

        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [N];

        for (int i = 0 ; i < arr.length ; i ++) {
            arr[i] = Integer.parseInt(br.readLine());
            arrList.add(arr[i]);
        }
        Collections.sort(arrList);
        for (int res : arrList) {
            System.out.println(res);
        }
    }
}
