package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoIntegerInput {
    public static void main (String [] args) throws Exception {
        // 1. (Git) 단계별 : 수학 - 2558번 A + B - 2

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());

        System.out.println(x + y);
    }
}
