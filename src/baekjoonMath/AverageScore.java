package baekjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AverageScore {
    public static void main(String[] args) throws Exception{
        // 1. (Git) 단계별 : 수학 - 10039번 평균점수

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int lowScore = 0;

        while (true)  {
            int score = Integer.parseInt(br.readLine());

            if (score < 40) {
                score =0;
                lowScore += 40;
            }
            lowScore += score;
            count ++;
            if (count == 5) {
                break;
            }
        }
        System.out.println(lowScore /5);

    }
}
