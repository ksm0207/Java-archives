package baekjoonImplement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TenLength11721Re {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // BaekjoonOnlineJudge
        String str = br.readLine();

        for (int i = 0 ; i < str.length(); i ++) {


            System.out.print(str.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }

        }
    }
}
