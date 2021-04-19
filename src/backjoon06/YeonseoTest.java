package backjoon06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YeonseoTest {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int room = 0;

        while (true) {
            if (room == 0) {
                a -= 1;
            } else {
                a -= room*6;
            }
            room ++;

            if (a <= 0) {
                System.out.println(room);
                return ;
            }
        }
    }
}
