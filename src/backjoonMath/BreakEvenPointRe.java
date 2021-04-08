package backjoonMath;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BreakEvenPointRe {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());


        if (C <= B) {
            System.out.println("-1");
            System.out.println("이익발생 X");
        }else{
            System.out.println("총 " +  (A / (C - B)+1)   + "개를 판매해야 이익이 발생합니다 ");
        }
    }
}
