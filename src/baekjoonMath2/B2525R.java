package baekjoonMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class B2525R {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Calendar cal = Calendar.getInstance();

        int hour = cal.get(Calendar.HOUR);
        int minute = cal.get(Calendar.MINUTE);

        System.out.println("현재 시간은 " + hour + " 시 " + minute + "분 입니다");
        System.out.println("타이머(분 단위) 를 입력하십시오");
        int minuteInput = Integer.parseInt(br.readLine());
        System.out.println(minuteInput + "분 후에 요리가 완성됩니다");

        int sum = minute + minuteInput;
        hour += sum / 60;
        minute += minuteInput - (60) * (sum / 60);

        System.out.println("요리가 완성되는 시간 :" + hour + " 시 " + minute + " 분 ");

    }
}
