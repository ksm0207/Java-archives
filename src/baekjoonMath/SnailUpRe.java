package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailUpRe {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 1. 낮에는 A 미터를 올라갈 수 있다
        int up = Integer.parseInt(st.nextToken());
        // 2. 밤에 잠을 자는 동안에는 B 미터 미끄러진다
        int down = Integer.parseInt(st.nextToken());
        // 3. 달팽이는 높이가 V 미터인 낙무 막대를 올라가야함
        int v = Integer.parseInt(st.nextToken());

        // 4. 정상에 올라간 후에는 미끄러지지 않는다
        // 달팽이가 나무 막대를 모두 올라가려면 며칠이 걸리는지 구한다

        // 5. 첫번째 예제 입력 값 = 2 1 5 일때 총 4일이 걸린다 이때 어떻게 구하면 될까?
        int day =  (v - down) / ( up - down);

        // 6. 5 1 6 일때 5칸 up 1칸 down 이고 6미터를 올라갈때는 어떻게 구할까?
        // 단순히 출력만 하면 1 이 나온다

        // 7. 첫번째 시도 : day가 가지고 있는 식을 % 으로 나머지로 반환 후 증감한다면?
        if ( (v - down) % ( up - down) != 0 )  {
            day ++;
        }
        System.out.println(day);
    }
}
