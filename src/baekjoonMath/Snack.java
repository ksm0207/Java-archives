package baekjoonMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Snack {
    public static void main(String[] args) throws IOException {
        // 1. (Git) 단계별 : 수학 - 10156번 과자

        // 과자 가격 300 원 구매 수 4 개 가진 돈 1000원 필요한 돈 200
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 과자 가격
        int N = Integer.parseInt(st.nextToken()); // 구매 개수
        int M = Integer.parseInt(st.nextToken()); // 가진 돈
        int needMoney = 0; // 필요한 돈


        // 경우의 수 1 과자 한개 가격 30원 구매 개수 4 가진 돈 100원
        // if (K * N) > M -- > print(needMoney)

        // 경우의 수 2 과자 한개 가격 250원 구매 개수 2 가진 돈 140
        // 위와 동일한 조건문에 해당될 것 같음

        // 경우의 수 3 과자 한개 가격 20원 구매 개수 6개 가진돈 120
        // else if ( (K * N) ==  M print 수식 (needMoney)

        // 경우의 수 4 과자 한개 가격 20 구매 개수 10개 가진돈 320원
        // if 조건이 false 일 경우 0 원

        if ( (K * N) > M ) {
            needMoney = (K * N) - M;
            System.out.println(needMoney);
        }else if ( (K * N) == M ) {
            System.out.println(needMoney);
        }else {
            System.out.println(0);
        }

    }
}
