package specialA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Bee {
    public static void main(String[] args) throws Exception {
        // 1. 벌집 - 2292번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int move =1 ;
        int range = 2;

        while (range <= N) {

            range = range + ( 6 * move);
            System.out.println(range);
            move ++;
        }
        System.out.println(move);
    }
}
