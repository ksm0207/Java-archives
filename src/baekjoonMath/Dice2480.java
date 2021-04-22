package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dice2480 {
    public static void main(String[] args) throws Exception {
        // 1. (Git) 단계별 : 수학 - 2480번 주사위 세개

        // 경우의 수 1 : 같은 눈 3개가 나오면 10000원 + (같은눈) * 1000 원을 받는다
        // ex) 2 2 2 이 주어지면 상금은 10000 + 2 * 100 = 12000원

        // 경우의 수 2 : 같은 눈 2개가 나오면 1000원 + (같은눈) * 100 원을 받는다
        // ex) 3 3 6 이 주어지면 상금은 1000 + 3 * 100 = 1300원

        // 경우의 수 3 : 모두 다른 눈이 나온다면 그 중 (가장 큰 눈) * 100원을 받는다
        // ex) 6 2 5 이 주어지면 6 * 100 = 600원

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int dice1 = Integer.parseInt(st.nextToken());
        int dice2 = Integer.parseInt(st.nextToken());
        int dice3 = Integer.parseInt(st.nextToken());
        int pay = 0;
        int max = dice1;

        if (dice1 == dice2 && dice2 == dice3) {
            System.out.println("경우의 수 1 같은 눈 3개가 있습니다");
            pay = 10000 + (dice1) * 1000;
            System.out.println(pay);
        }else if (dice1 == dice2 || dice1 == dice3 ||  dice2 == dice3) {
            // 1 1 2 = 1000 + 1 * 100 = 1100원
            // 1 2 1 = 위와 동일
            // 2 1 1 = dice 1 로 기준을 잡는다면 계산 오류..
            if (dice2 == dice3) {
                System.out.println("경우의 수 2 같은 눈 2개가 있습니다 (2)");
                pay = 1000 + dice2 * 100;
                System.out.println(pay);
            }else {
                System.out.println("경우의 수 2 같은 눈 2개가 있습니다");
                pay = 1000 + dice1 * 100;
                System.out.println(pay);
            }
        }else {
            // int max = dice1

            if (max < dice2) {
                max = dice2;
            }
            if (max < dice3) {
                max = dice3;
            }
            pay = max * 100;
            System.out.println(pay);
        }
    }
}