package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon04R {
    public static void main(String[] args)  throws Exception{

        // 1. 단계 6 (Git) 문자열 - 2675번 문자열 반복
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String repeated = "";
        StringTokenizer st;
        boolean check = true;

        for (int i = 0 ; i < count ; i ++) {
            st = new StringTokenizer(br.readLine()," ");
            // 1. i = 0 < Integer > i = 1 < String >
            int N = Integer.parseInt(st.nextToken()); // 문자열 반복 변수
            String S = st.nextToken();
            // input for end

            // out for start
            for (int j = 0 ; j < S.length(); j ++) {
//                System.out.println(j + " " + S.length());
                char find = S.charAt(j);
                repeated += new String(new char[N]).replace('\0',find);

                if (j == S.length() -1) {
                    repeated += "\n";
                    System.out.println(" if 결과 ===========> "  +repeated );
                    System.out.println(" if 결과 2 ============ > "  + j );


                }
//                System.out.println(  j +" Find ==== > "+find);
//                System.out.println(repeated);
//                System.out.println(S.length());
            }
        }
        System.out.print(repeated);

    }
}
//2
//3 ABC
//5 /HTP