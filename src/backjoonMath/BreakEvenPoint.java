package backjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPoint {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        // 0. 손익분기점 을 구하는 프로그램

        int fixedMoney = Integer.parseInt(st.nextToken()); // 고정비용
        int variableCost = Integer.parseInt(st.nextToken()); // 가변비용
        int price = Integer.parseInt(st.nextToken()); // 측정 값

        if (price <= variableCost) {
            // 170 <= 70
            // 1 <= 2
            System.out.println(-1);
        }else{
            System.out.println( (fixedMoney / (price - variableCost))+1 );
        }
    }
}

