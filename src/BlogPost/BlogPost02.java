package BlogPost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlogPost02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int sum = 0;
        String value = br.readLine();

        for (int i = 0 ; i < count ; i ++) {
            sum += value.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
