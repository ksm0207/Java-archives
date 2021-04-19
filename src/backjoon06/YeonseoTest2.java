package backjoon06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YeonseoTest2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < n ; i++) {
            int f = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());

            System.out.println(getNum(f,room));;
        }
    }

    public static int getNum(int a, int b){
        if(b == 1)
            return 1;
        if(a == 0)
            return b;
        return (getNum(a-1, b) + getNum(a, b-1));
    }
}
