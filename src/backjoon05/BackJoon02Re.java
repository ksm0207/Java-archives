package backjoon05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BackJoon02Re {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int sum = 0;

        for (byte value : br.readLine().getBytes(StandardCharsets.UTF_8)) {
            sum += value - '0';
            // 0 은 UTF-16 인코딩에 맞게 해당 문자의 입력 값을 저장하므로 0 혹은 -48 을 빼주어야함
        }
        System.out.println(sum);

    }
}
