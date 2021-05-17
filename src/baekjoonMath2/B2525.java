package baekjoonMath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2525 {
    public static void main(String[] args) throws Exception {
        // Git - 백준 2525 오븐 시계 ( 분류 : 사칙연산 , 수학 )

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int time = Integer.parseInt(st.nextToken()); // 0 ~ 23
        int minute = Integer.parseInt(st.nextToken()); // 0 ~ 59
        int addMinute = Integer.parseInt(br.readLine());
        int sum = minute + addMinute;

        time += sum / 60; // 14  += 50 / 60 { 0.8......)
        minute += addMinute - (60)  * (sum / 60);  // 30 + 20

        if (time >= 24 ) {
            time -= 24;
        }
        System.out.println(time + " 시 " + minute + "분" );
    }
}
