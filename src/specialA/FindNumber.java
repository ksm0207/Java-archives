package specialA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindNumber {
    public static void main(String[] args) throws Exception {
        // 1. X 보다 작은 수 - 10871번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int res = 0;

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine()," ");

        for (int i = 0 ; i < N; i ++) {
            int findValue = Integer.parseInt(st.nextToken());

            if (findValue < X) {
                sb.append(findValue).append(" ");

            }
        }
        System.out.println(sb);


    }
}
