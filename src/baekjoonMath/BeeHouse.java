package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeeHouse {
    public static void main(String[] args) throws Exception {
        // 0. 벌집 문제
        // 1. 1부터 시작하여 이웃방에 돌아다니면서 카운트가 1씩 증가한다
        // 2. 숫자 N이 주어졌을 때 1번부터 N번 방까지 "최소 개수" 방을 지나야 한다
        // 3. 방은 6의 배수로 점점 늘어 난다
        // 4. 지나서 갈 때 몇 개의 방을 지나가는지( 시작 / 끝 포함 )를 계산하는 프로그램

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int moveCount = 1;
        int range = 2;

        if (N == 1) {
            System.out.println(1);
        }else{
            while (range <= N){
                range = range + ( 6 * moveCount);
                moveCount++;
            }
            System.out.println(moveCount);
        }

    }
}
