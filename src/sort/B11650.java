package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B11650 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int [][] array = new int[N][2]; // N행 2열

        for (int i = 0 ; i < N ; i ++) {
            // [][] 배열 데이터 저장
            st = new StringTokenizer(br.readLine()," ");
            array[i][0] = Integer.parseInt(st.nextToken()); // [i][0] = x
            array[i][1] = Integer.parseInt(st.nextToken()); // [i][1] = y
        }
        // x 좌표가 증가하는 순으로   x 좌표가 같으면 y 좌표가 증가하는 순서로 정렬해야함.
        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            // 3 4 1  2
            public int compare(int[] o1, int[] o2) {

                System.out.println("Object1 [0] ====== > "+ o1[0]);
                System.out.println("Object2 [0] ====== > "+ o2[0]);


                if (o1[0] == o2[0]) {
                    System.out.println("if");
                    return o1[1] - o2[1];
                }else{
                    System.out.println("else");
                    return o1[0] - o2[0];
                }
            }
        });

        for (int i = 0 ; i < N; i ++) {
            sb.append(array[i][0]).append(" ").append(array[i][1]).append("\n");
        }
        System.out.println(sb);
    }
}
