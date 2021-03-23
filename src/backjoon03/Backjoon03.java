package backjoon03;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon03 {
    public static void main (String [] args) throws Exception {
        // 150 266 427

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine())
                  * Integer.parseInt(br.readLine())
                  * Integer.parseInt(br.readLine());

        String str = String.valueOf(value);
        // 1 7 0 3 7 3 0 0
        // 0 = 3
        // 1 = 1
        // 2 = 0
        // 3 = 2
        // 4 = 0
        // 5 = 0
        // 6 = 0
        // 7 = 2
        // 8 = 0
        // 9 = 0 ... 3 1 0 2 0 0 0 2 0 0
        for (int i = 0 ; i < str.length(); i ++) {
            System.out.println(str);
        }
    }
}
