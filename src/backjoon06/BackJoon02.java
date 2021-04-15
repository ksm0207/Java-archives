package backjoon06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BackJoon02 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int x;
        int y;

        // 1. 0 2개 일때는 프로그램 종료 아닐때는 ?
        while (true){
            try {
                st = new StringTokenizer(br.readLine()," ");
                x = Integer.parseInt(st.nextToken());
                y = Integer.parseInt(st.nextToken());
                System.out.println(x + y);
            }catch (Exception error){
                break;
            }

        }
    }
}
