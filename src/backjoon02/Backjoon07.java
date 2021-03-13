package backjoon02;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Backjoon07 {
    public static void main ( String [] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int value = Integer.parseInt(br.readLine());
        int count = 0;


        for (int i = 0 ; i < value ; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            count ++;
            bw.write("Case #" +count+": ");
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
