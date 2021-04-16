package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ArraySort {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        int count = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0 ; i < count ; i ++) {
            arrList.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arrList);
        System.out.println(arrList.get(0) + " " + arrList.get(count-1));
    }
}
