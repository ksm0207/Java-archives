package baekjoonMath2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B5554 {
    public static void main(String[] args) throws Exception {
        // Git - 백준 5554번 심부름 가는길 ( 분류 : 사칙연산 )

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int total  = 0;


//      첫 번째 줄에 집에서 학교까지의 이동 시간을 나타내는 초가 주어진다.
        int house = Integer.parseInt(br.readLine()); // 집

//      두 번째 줄에 학교에서 PC방까지의 이동 시간을 나타내는 초가 주어진다.
        int school = Integer.parseInt(br.readLine()); // 학교

//      세 번째 줄에 PC방에서 학원까지의 이동 시간을 나타내는 초가 주어진다.
        int pcRoom = Integer.parseInt(br.readLine()); // PC방

//      마지막 줄에 학원에서 집까지의 이동 시간을 나타내는 초가 주어진다.
        int academy = Integer.parseInt(br.readLine()); //  학원

        total = house + school + pcRoom + academy ; // 초

        int time = total / 60; // 시간
        int minute = total - (time * 60); // 분

        System.out.println(time  + "\n"  + minute);
    }
}
