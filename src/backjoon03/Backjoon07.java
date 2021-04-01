package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon07 {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int [] arr;
        StringTokenizer st;

        for (int i = 0 ; i < testCase ; i ++) {
            st = new StringTokenizer(br.readLine() , " ");

            int studentCount = Integer.parseInt(st.nextToken());
            arr = new int [studentCount];

            double sum = 0.0;

            for (int j = 0 ; j <studentCount ; j ++) {
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
                System.out.println("J = "+ j + "  arr[j] = " + arr[j]);
                System.out.println(sum);
            }
            double finalScore = (sum / studentCount);
            double count = 0.0;

            for (int k = 0 ; k < studentCount ; k ++) {
                if (arr[k] > finalScore) {
                    System.out.println("이건 무슨 129? "+arr[k]);
                    count ++;
                }
            }
            System.out.printf("%.3f%%\n",(count/studentCount)*100);
        }
    } // end of main
}
