package specialA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeeRe {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int findRoom = Integer.parseInt(br.readLine());
        int beeMove = 1;
        int range = 1;

            while (range <= findRoom){
                range = range + (6 * beeMove); // 2 + 2 * 13
                System.out.println("range 연산 결과 : "+range);
                beeMove ++;
        }
        System.out.println(beeMove);

    }
}
