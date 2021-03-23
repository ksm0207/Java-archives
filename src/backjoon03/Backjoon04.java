package backjoon03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Backjoon04 {
    public static void main(String [] args) throws IOException {

        // 배열 X

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();
        int value;

        for (int i = 0 ; i < 10 ; i ++) {
            value = Integer.parseInt(br.readLine()) % 42;
            hs.add(value);
        }
        System.out.println(hs.size());
    }
}
