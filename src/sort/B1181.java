package sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B1181 {
    public static void main(String[] args)  throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String [] arr = new String[N];

        for (int i = 0 ; i < N ; i ++) {
            arr[i] = br.readLine();
        }


    }
}
