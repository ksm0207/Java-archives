package backjoon03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Backjoon02Re {
    public static void main(String [] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int indexOf = 0;
        int input = 0;
        int max = 0;

        for (int i = 0 ; i < 9 ; i ++) {
            input = Integer.parseInt(br.readLine());

            if (input > max) {
                max = input;
                indexOf = i ;
            }
        }
        System.out.println(max);
        System.out.println(indexOf + 1);
    }
}
