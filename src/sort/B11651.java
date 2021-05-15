package sort;

import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11651 {
    public static void main(String[] args)  throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int count = Integer.parseInt(br.readLine());
        int [][] array = new int[count][2];

        for (int i = 0 ; i < count; i ++) {
            st = new StringTokenizer(br.readLine(), " ");
            array[i][0] = Integer.parseInt(st.nextToken());
            array[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] num1, int[] num2) {

                if (num1[0] < num2[1]) {
                    return num1[0] - num2[0];

                }else if (num1[0] == num2[1]) {
                    return num1[0] - num2[0];
                }else{
                    return num1[0] - num2[0];

                }
            }
        });

        for (int j = 0 ; j < count ; j ++) {
            sb.append(array[j][0]).append(" ").append(array[j][1]).append("\n");
        }

        System.out.println(sb);

    }
}
