package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Backjoon05 {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double forCount = Double.parseDouble(br.readLine());
        double result = 0.0;

        Double [] arrScore = new Double [(int) forCount];
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i =0 ; i < arrScore.length ; i ++) {
            arrScore[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arrScore);

        for (int i = 0 ; i < arrScore.length ; i ++){
            result += ( (arrScore[i] / arrScore[arrScore.length-1]) *100);
            System.out.println("점수 현황 : "+arrScore[i]);
            System.out.println("길이 -1 현황 :  " +arrScore[arrScore.length-1]);
            System.out.println("최종 결과 : "+arrScore[i] / arrScore[arrScore.length-1]);
            System.out.println("결과 값 : "+result);
        }
        System.out.println(result / forCount);
    }
}
