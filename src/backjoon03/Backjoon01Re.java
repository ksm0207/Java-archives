package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon01Re {
    public static void main (String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int [] array = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0 ; i < array.length ; i ++ ) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        System.out.println(array[0] + " " + array[count - 1]);
        br.close();
    }
}
