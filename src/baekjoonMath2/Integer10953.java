package baekjoonMath2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Integer10953 {
    public static void main(String[] args)  throws Exception {
        // 1. (Git) 단계별 : 수학 - 10953번 A+B - 6

        // 1. 테스트 케이스는 한줄로 이루어지며 A 와 B 정수를 입력한다
        // A 와 B는 콤마 로 구분지어 입력한다. ex ) A,B

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] str;
        int count = Integer.parseInt(br.readLine());
        int [] arr = new int[count];


        for (int i = 0 ; i < count ; i ++) {
            str = br.readLine().split(",");
            arr[i] = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
        }
        for (int res : arr) {
            System.out.println(res);
        }
    }
}
