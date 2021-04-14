package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BackJoon02 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();

        int val = Integer.parseInt(br.readLine()); // 첫째 줄
        for (int i = 0 ; i < val; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for (int res : list){
            sb.append(res).append("\n");
        }
        System.out.println(sb);
    }
}
