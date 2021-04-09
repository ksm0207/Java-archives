package specialA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnailUp {
    public static void main(String[] args) throws  Exception {
        // 1. 달팽이는 올라가고 싶다 - 2869번

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());


        int day = (V - down) / (up - down);


        if ((V - down) % (up - down) != 0 ) {
            day ++;
        }
        System.out.println("달팽이가 " + V + " 미터를 오를려면  " + day + " 일이 소요됩니다");


    }
}
