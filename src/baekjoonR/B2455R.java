package baekjoonR;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2455R {
    public static void main(String[] args) throws Exception {
        // Git - 백준 2455 지능형 기차 ( 분류 : 사칙연산 )
        // Hint : Math.max
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int count =0;

        for (int i = 0 ; i < 4 ; i ++) {
            st = new StringTokenizer(br.readLine()," ");
            int outPeople = Integer.parseInt(st.nextToken());
            int inPeople = Integer.parseInt(st.nextToken());

            count ++;

            System.out.println(count + " 번역 열차 " +
                    " 내린 사람 수 : " + outPeople +
                    " 탄 사람 수 : " + inPeople);
        }
    }
}
