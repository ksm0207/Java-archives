package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon01Final {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arrCount = Integer.parseInt(br.readLine());
        int[] arr = new int [arrCount];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0 ; i < arr.length; i ++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[0] +" "+arr[arrCount - 1]);
    }
}
