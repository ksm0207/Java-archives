package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MinusValue {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine());

        for (int i = value ; i > 0 ; i -- ) {
            System.out.println(i);
        }
    }
}
