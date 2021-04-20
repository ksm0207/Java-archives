package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int count = Integer.parseInt(br.readLine());
        String res = "";

        for (int i = 0 ; i < count; i ++) {
            st = new StringTokenizer(br.readLine(), " ");
            int repeat = Integer.parseInt(st.nextToken());
            String S = st.nextToken();

            for (int r = 0; r < S.length() ; r++) {
                char copyChar = S.charAt(r);
                char newS = '\0';
                res += new String(new char[repeat]).replace(newS, copyChar);
                System.out.println(S.length());
                System.out.println(r);

                if(r == S.length()-1) {
                    res += "\n";
                }
            }
        }
        System.out.println(res);
    }
}
