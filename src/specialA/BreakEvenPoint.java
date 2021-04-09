package specialA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {
    public static void main(String[] args) throws Exception {

        // 1. 손익분기점 - 1712번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        // 변수에 집어넣으면 by_zero 런타임 오류 발생함 : 0으로 나누는 경우
//        int D = ((A / (C-B))+1); //  (1000 / (170-70)) + 1

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

                     // 170 < 70
        if (C - B < 0 ) { // 1 < 2
            System.out.println("-1");
        }else{
            System.out.println(  ((A / (C-B))+1)  );
        }
    }
}
