package backjoon03;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon02Re {
    public static void main(String [] args) throws IOException {

        int indexOf = 0;
        int input = 0;
        int max = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());



        for (int i = 0 ; i < 9 ; i ++) {
            input = Integer.parseInt(st.nextToken());
            if (input > max) {
                max = input;
                indexOf = i ;
            }
        }
        System.out.println(max);
        System.out.println(indexOf + 1);
    }
}
