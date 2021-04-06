package BlogPost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlogPost02Re {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        br.readLine();

        for (byte res : br.readLine().getBytes()){
            sum += res-'0';
        }
        System.out.println(sum);
    }
}
