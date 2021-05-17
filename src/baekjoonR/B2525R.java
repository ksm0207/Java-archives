package baekjoonR;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2525R {

    int time;
    int minute ;

    public int result(int time, int minute , int timer){
        System.out.println(timer + "분 입력되었습니다. ");
        this.time = time;
        this.minute = minute;
        System.out.println(time + " 시 " + minute + " 분에 완성됩니다.");
        return 0;
    }

    public static void main(String[] args) throws Exception {
        // Git - 백준 2525 오븐 시계 ( 분류 : 사칙연산 , 수학 )
        // Hint : sum 은 60으로 나눈다

        System.out.println("현재 시간을 입력하십시오 .");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        B2525R b25 = new B2525R();

        int time = Integer.parseInt(st.nextToken()); // 시간
        int minute = Integer.parseInt(st.nextToken()); // 분

        System.out.println("타이머를 입력하십시오 . ( 분단위 입력 )");
        int timer = Integer.parseInt(br.readLine()); // 시간추가(분 단위)
        int sum = minute + timer;

        time += sum / 60;
        minute += timer - (60) * (sum / 60); // 20 - 60 * 0
        b25.result(time , minute, timer);
    }
}
