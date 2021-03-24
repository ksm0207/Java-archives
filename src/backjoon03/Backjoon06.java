package backjoon03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon06 {
    public static void main(String [] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int forCount = Integer.parseInt(br.readLine());
        int countValue = 0;
        int result = 0;

        String [] arr = new String[forCount];

        for (int i = 0 ; i < arr.length ; i++) {
            arr[i] = String.valueOf(br.readLine());
        }

        for (int i = 0 ; i < forCount ; i ++) {

            System.out.println(countValue);
            System.out.println(result);

            for (int j = 0; j < arr[i].length(); j ++) {

                if (arr[i].charAt(j) == 'O'){
                    countValue ++;
                }else{
                    countValue = 0;
                }
                result += countValue;
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
