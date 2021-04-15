package backjoon06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BackJoon03 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int value = N;
        int count = 0;

//        System.out.println( ( (N%10)*10 ) );
//        System.out.println((N/10));
//        System.out.println((N%10)%10);
//                System.out.println( ( (N%10)*10 ) + ( ((N/10) + (N%10))%10 ));

        while (true) {
            N = ( (N%10)*10) + ( ( ( N/10 ) + ( N%10 ) ) %10 );
            count ++;

            System.out.println("Count ==== > "+count);
            System.out.println("N =====  > "+N);

            if (N == value) {
                break;
            }
        }
        System.out.println(count);

    }
}