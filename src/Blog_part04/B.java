package Blog_part04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B extends A{
    public static void main(String [] args) throws IOException {

        A a = new A();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Class 테스트 1 ~ 3 숫자 입력");
        int value = Integer.parseInt(br.readLine());
        int one=0,two=0;

        System.out.println("덧셈은 총" + value + "번 진행할 수 있습니다 !!");
        for (int i = 0 ; i < value ; i ++) {

            System.out.println("첫번째 정수 입력");
            one = Integer.parseInt(br.readLine());

            System.out.println("첫번째 정수 입력");
            two = Integer.parseInt(br.readLine());

            System.out.println("결과");
            System.out.println(a.Number(one,two));
        }
    }
}
