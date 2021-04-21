package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailUp {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int snailUp = Integer.parseInt(st.nextToken());
        int snailDown = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int dayRes = (V - snailDown) / (snailUp - snailDown);

        // 2 1 5 값을 입력했을때
        // dayRes = ( 5 - 1 ) / ( 2 - 1) 는 4 / 1 이므로 4일이 된다 ? [확인]

        // 5 1 6 값을 입력했을때
        // dayRes = ( 6 - 1 ) / ( 5 - 1 ) 는 5 / 4 이므로 1일이 된다 ? [확인]
        // 하지만 출력해야 할 값은 2 인데..


        // 1. dayRes 변수가 가지는 식을 가지고 몫이     1일 경우 dayRes 증감 조건식 / [실패]
        // 2. dayRes 변수가 가지는 식을 가지고 나머지는 1일 경우 dayRes 증감 조건식 % [실패]
        // 3. dayRes 변수가 가지는 식을 가지고 0 과 일치하지 않는다면 dayRes 증감 [성공]

        if ((V - snailDown) % (snailUp - snailDown) != 0) {
            dayRes++;
        }
        System.out.println(dayRes);
    }
}
