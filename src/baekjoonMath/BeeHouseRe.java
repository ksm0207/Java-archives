package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeeHouseRe {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int minRange = 2;

        while (minRange <= N) {
            minRange = minRange + (6 * count);
            count ++;
        }
        System.out.println(count);

    }
}
